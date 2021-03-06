package reflection;

import java.io.Serializable;

/**
 * @author Sergey Klunniy
 */


public class SomeObject extends SuperSomeObject {
    public String name;
    private String famaly;
    private int age;

    public SomeObject() {
    }

    public SomeObject(String name) {
        this.name = name;
    }

    public SomeObject(String name, String famaly, int age) {
        this.name = name;
        this.famaly = famaly;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void go() {
        System.out.println("Обьект идет на работу");
    }

    @Override
    public String toString() {
        return "SomeObject{" +
                "name='" + name + '\'' +
                ", famaly='" + famaly + '\'' +
                ", age=" + age +
                '}';
    }
}
