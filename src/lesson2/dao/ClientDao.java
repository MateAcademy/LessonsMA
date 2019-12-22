package lesson2.dao;

import lesson2.model.Client;

/**
 * @author Sergey Klunniy
 */
public interface ClientDao {
    void save(Client client);
    Client get();
}
