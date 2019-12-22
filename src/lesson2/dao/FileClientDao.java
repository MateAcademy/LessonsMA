package lesson2.dao;

import lesson2.model.Client;

import java.io.*;

/**
 * @author Sergey Klunniy
 * Как видишь, мы создали 2 потока — FileOutputStream и ObjectOutputStream. Первый из них умеет
 * записывать данные в файл, а второй — преобразует объекты в байты.
 */
public class FileClientDao implements ClientDao{

    public void save(Client client) {
        //умеет записывать данные в файл
        //а второй — преобразует объекты в байты
        try ( ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("storage.dat"))){
            os.writeObject(client);
        } catch (IOException e) {
            System.out.println("Не удалось записать клиента в базу");
            e.printStackTrace();
        }
    }

//TODO: надо научится брать по имени?
    public Client get(){
        try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("storage.dat"))) {
            Client client = (Client) oi.readObject();
            return client;
        } catch (Exception e) {
            System.out.println("Клиент не найден в системе");
            e.printStackTrace();
            return null;
        }
    }
}

