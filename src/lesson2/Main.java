package lesson2;

import lesson2.dao.FileClientDao;
import lesson2.model.Client;

import java.io.IOException;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileClientDao fileClientDao = new FileClientDao();
//        fileClientDao.save(new Client("Sergei" , "+380501430700"));
//        fileClientDao.save(new Client("Sasha" , "+380508645256"));


        System.out.println(fileClientDao.get());
//        System.out.println(fileClientDao.get());
    }

//todo: задача со статик полем у клиента?
}
