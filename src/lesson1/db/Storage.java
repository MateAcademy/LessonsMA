package lesson1.db;

import lesson1.model.Bet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Klunniy
 * это наша БД
 */
public class Storage implements AutoCloseable {
    public static final List<Bet> bets = new ArrayList<>();

    @Override
    public void close() throws Exception {
        System.out.println("Ресурсы закрыты");
    }
}
