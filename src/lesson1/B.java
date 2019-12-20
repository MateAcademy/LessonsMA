package lesson1;

/**
 * @author Sergey Klunniy
 */
public class B {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = "Hello";
        String s4 = "Hello".intern();

        System.out.println(s1==s3);
        System.out.println(s1==s2);

    }
}
