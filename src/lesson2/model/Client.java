package lesson2.model;

import java.io.Serializable;

/**
 * @author Sergey Klunniy
 */
public class Client implements Serializable {
//Это поле содержит уникальный идентификатор версии сериализованного класса:
    private static long serialVersionUID = 0L;
    private String name;
    private String phoneNamber;

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", phoneNamber='" + phoneNamber + '\'' + "версия сериал обьекта: " + serialVersionUID +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNamber() {
        return phoneNamber;
    }

    public void setPhoneNamber(String phoneNamber) {
        this.phoneNamber = phoneNamber;
    }

    public Client(String name, String phoneNamber) {
        serialVersionUID++;
        this.name = name;
        this.phoneNamber = phoneNamber;
    }
}
