package lesson1;

import lesson1.controller.ConsoleHandler;
import lesson1.dao.BetDao;
import lesson1.dao.BetDaoImpl;
import lesson1.lib.Injector;

/**
 * @author Sergey Klunniy
 */
public class Main {

    static {
        try {
            Injector.injectDependency();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Если хотите сделать ставку, введите сумму и риск через пробел: ");
        ConsoleHandler.handler();
        printBet();
    }

    private static void printBet() {
        BetDao betDao = new BetDaoImpl();
        System.out.println(betDao.getAll());
    }
}
