package lesson2.dao;

import lesson2.model.Client;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Sergey Klunniy
 */
public class FileClientDao {

    public void save(Client client) throws IOException {
        //умеет записывать данные в файл
        FileOutputStream fo  = new FileOutputStream("storage.dat");
        //а второй — преобразует объекты в байты
        ObjectOutputStream os = new ObjectOutputStream(fo);
        os.writeObject(client);
        os.close();
    }

    public void getClient() throws IOException, ClassNotFoundException {
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("storage.dat"));
//        oi.readObject();
        while (oi.readObject() != null) {
            System.out.println(oi.readObject());
        }
    }
}
