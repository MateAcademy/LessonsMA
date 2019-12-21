package lesson1.dao;

import lesson1.model.Bet;

import java.util.List;

/**
 * @author Sergey Klunniy
 * это класс для доступа к данным из хранилища, отвечает за создание коннекшина,
 * открыть соединение
 * выполнить запрос, закрыть соединение...
 *
 * Наш класс для работы с базой данных и таблицей ставок
 */
public interface BetDao {

    void add(Bet bet);
    List<Bet> getAll();
}
