package lesson1.controller;

import lesson1.dao.BetDao;
import lesson1.lib.Inject;
import lesson1.model.Bet;

import java.util.Scanner;

/**
 * @author Sergey Klunniy
 */
public class ConsoleHandler {

    @Inject
    private static BetDao betDao;
//    private static final BetDao betDao = BetDaoFactory.getBetDao();

    public static void handler() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String command = scanner.nextLine();
                if (command.equals("0")) {
                    return;
                }
                String[] data = command.split(" ");
                int value = Integer.parseInt(data[0]);
                double risk = Double.parseDouble(data[1]);
                Bet bet = new Bet(value, risk);
                betDao.add(bet);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Данные введены не корректно");
        }
    }
}



