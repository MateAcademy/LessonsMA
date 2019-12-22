package lesson2.handler;

import lesson2.dao.ClientDao;
import lesson2.dao.FileClientDao;
import lesson2.model.Client;

import java.util.Scanner;

/**
 * @author Sergey Klunniy
 */
public class ConsoleHandler {

    private static final ClientDao clientDao = new FileClientDao();

    public void handler() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-если вносите клиента, 2-если получаете клиента");
        System.out.println("введите информацию о клиенте");
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.out.println("Введите телефон");
        String phone = scanner.nextLine();
        Client client = new Client(name, phone);
        clientDao.save(client);

    }
}
