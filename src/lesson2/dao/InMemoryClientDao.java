package lesson2.dao;

import lesson2.di.Component;
import lesson2.model.Client;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Klunniy
 */
@Component
public class InMemoryClientDao implements ClientDao {

    private static final List<Client> inMemoryStorage = new ArrayList<>();

    @Override
    public void save(Client client) {
        inMemoryStorage.add(client);
    }

    @Override
    public Client get() {
        return (Client) inMemoryStorage.get(0);
    }
}
