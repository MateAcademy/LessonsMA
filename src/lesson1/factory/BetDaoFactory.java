package lesson1.factory;

import lesson1.dao.BetDao;
import lesson1.dao.BetDaoImpl;

/**
 * @author Sergey Klunniy
 */
public class BetDaoFactory {

    public static BetDao instance;

    public static BetDao getBetDao() {
        if (instance == null) {
            instance = new BetDaoImpl();
        }
        return instance;
    }

}
