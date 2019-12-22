package lesson1.lib;

import lesson1.comtroller.ConsoleHandler;
import lesson1.dao.BetDaoImpl;
import lesson1.factory.BetDaoFactory;

import java.lang.annotation.Annotation;
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

        Annotation[] annotations = betDaoImplClass.getAnnotations();

        Field[] consoleHandlerFilds = consoleHandlerClass.getDeclaredFields();
        for (Field field : consoleHandlerFilds) {
            if (field.getDeclaredAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                field.set(null, BetDaoFactory.getBetDao());
//Этот метод устанавливает значение в поле, если стоит над полем аннотация Inject,
//                 она должна внедрять зависимость
            }
        }
    }
}
