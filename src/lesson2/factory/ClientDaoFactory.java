package lesson2.factory;

import lesson2.dao.ClientDao;
import lesson2.dao.FileClientDao;
import lesson2.dao.InMemoryClientDao;
import lesson2.myExseption.ComponentNotFoundException;
import lesson2.service.PropertyLoader;

import java.io.IOException;

/**
 * @author Sergey Klunniy
 */
public class ClientDaoFactory {

    private static final ClientDao inMemoryDao = new InMemoryClientDao();
    private static final ClientDao fileDao = new FileClientDao();

    public static ClientDao getClientDao(boolean isFileDAO, boolean isInMemoryDao) {
        try {
            String dbName = PropertyLoader.getProperty("db.name");
            if (dbName.equals("memory") && isInMemoryDao) {
                return inMemoryDao;
            }
            if (dbName.equals("file") && isInMemoryDao) {
                return fileDao;
            }
        } catch (IOException e) {
            System.err.println("Нет доступа к файлу application.properties");
        }
        throw new ComponentNotFoundException();
    }
}
