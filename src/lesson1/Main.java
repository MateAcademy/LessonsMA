package lesson1;

import lesson1.Storage;

import java.util.ArrayList;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) throws Exception {
        test();
        ArrayList<ArrayList> arrayList = new ArrayList<ArrayList>();
    }

    private static void test() {
        try (Storage storage = new Storage()) {
            System.out.println("Выполняем try");
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Выполняем catch");
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
