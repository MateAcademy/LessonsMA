package lesson2.di;

import lesson2.dao.ClientDao;
import lesson2.dao.FileClientDao;
import lesson2.dao.InMemoryClientDao;
import lesson2.factory.ClientDaoFactory;
import lesson2.handler.ConsoleHandler;

import java.lang.reflect.Field;

/**
 * @author Sergey Klunniy
 */
public class Injector {

    public static void injectDependency() {
        Class consoleHandlerClass = ConsoleHandler.class;
        Class fileClientDaoClass = FileClientDao.class;
        Class inMemoryClientDaoClass = InMemoryClientDao.class;

        Field[] fields = consoleHandlerClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Inject.class)) {
                boolean fileDao = fileClientDaoClass.isAnnotationPresent(Component.class);
                boolean inMemoryDao = inMemoryClientDaoClass.isAnnotationPresent(Component.class);
                if (fileDao) System.out.println("Работа с файлами разрешена ");
                if (inMemoryDao) System.out.println("Работа с памятью разрешена ");
                ClientDao clientDao = ClientDaoFactory.getClientDao(fileDao, inMemoryDao);
                try {
                    field.set(null, clientDao);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
