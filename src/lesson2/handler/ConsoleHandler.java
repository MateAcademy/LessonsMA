package lesson2.handler;

import lesson2.dao.ClientDao;
import lesson2.di.Inject;
import lesson2.model.Client;

import java.util.Scanner;

/**
 * @author Sergey Klunniy
 */
public class ConsoleHandler {

    @Inject
    private static ClientDao clientDao; //как внедрить зависимость
//    private static final ClientDao clientDao = ClientDaoFactory.getClientDao();
//    private static final ClientDao clientDao = new FileClientDao();

    public static void handler() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1-если вносите клиента, 2-если получаете клиента, 3-для выхода");
            int consoleChoise = scanner.nextInt();
            switch (consoleChoise) {
                case 1:
                    addClientInfo(scanner);
                    break;
                case 2:
                    System.out.println(clientDao.get());
                    break;
                case 3:
                    System.exit(0);
                    break;
            }

        }
    }

    private static void addClientInfo(Scanner scanner) {
        System.out.println("введите информацию о клиенте");
        System.out.println("Введите имя");
        String name = scanner.next();
        System.out.println("Введите телефон");
        String phone = scanner.next();
        Client client = new Client(name, phone);
        clientDao.save(client);
    }
}
