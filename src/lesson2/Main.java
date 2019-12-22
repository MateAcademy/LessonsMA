package lesson2;

import lesson2.dao.ClientDao;
import lesson2.dao.FileClientDao;
import lesson2.dao.InMemoryClientDao;
import lesson2.di.Component;
import lesson2.di.Inject;
import lesson2.di.Injector;
import lesson2.factory.ClientDaoFactory;
import lesson2.handler.ConsoleHandler;

import java.lang.reflect.Field;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {
        Injector.injectDependency();
        ConsoleHandler.handler();
    }


}
