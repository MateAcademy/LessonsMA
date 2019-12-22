package lesson1.dao;


import lesson1.db.Storage;
import lesson1.lib.Dao;
import lesson1.model.Bet;

import java.util.List;

/**
 * @author Sergey Klunniy
 * здесь код подключение к бд, инициал соединения, открытие транзакции,
 * генерацмия запроса, получение запроса,
 * получение рез, распарсивание рез в данные и возврат
 */
@Dao  //эта аннотация ставится там где указываю че хочу инжектить
public class BetDaoImpl implements BetDao {
    @Override
    public void add(Bet bet) {
        Storage.bets.add(bet);
    }

    @Override
    public List<Bet> getAll() {
        return Storage.bets;
    }
}
