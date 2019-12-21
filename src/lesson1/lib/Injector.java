package lesson1.lib;

import lesson1.comtroller.ConsoleHandler;
import lesson1.dao.BetDaoImpl;
import lesson1.factory.BetDaoFactory;

import java.lang.reflect.Field;

/**
 * @author Sergey Klunniy
 */
public class Injector {

    public static void injectDependency() throws IllegalAccessException {
        //Class<ConsoleHandler> consoleHandlerClass = Class.forName("имя класса");
        //Class<ConsoleHandler> consoleHandlerClass = new ConsoleHandler().getClass();
        Class<ConsoleHandler> consoleHandlerClass = ConsoleHandler.class;
        Class<BetDaoImpl> betDaoImplClass = BetDaoImpl.class;

        Field[] consoleHandlerFilds = consoleHandlerClass.getDeclaredFields();
        for (Field field : consoleHandlerFilds) {
            if (field.getDeclaredAnnotation(Inject.class) != null) {
                field.set(null, BetDaoFactory.getBetDao());
//Этот метод устанавливает значение в поле
            }
        }
    }
}
