package lesson1;

import lesson1.comtroller.ConsoleHandler;
import lesson1.dao.BetDao;
import lesson1.dao.BetDaoImpl;
import lesson1.lib.Injector;

/**
 * @author Sergey Klunniy
 */
public class Main {

    static {
        Injector.injectDependency();
    }

    public static void main(String[] args) {
        System.out.println("Если хотите сделать ставку, введите \n " +
                " сумму и риск через пробел:");
        ConsoleHandler.handler();
        BetDao betDao = new BetDaoImpl();
        System.out.println(betDao.getAll());
    }
}
