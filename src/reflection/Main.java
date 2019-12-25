package reflection;

import java.lang.reflect.Modifier;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {
        Class<SomeObject> someObjectClass = SomeObject.class;
        int classModifiers = someObjectClass.getModifiers();

        System.out.println(Modifier.isPublic(classModifiers));
    }
}
