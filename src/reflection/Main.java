package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @author Sergey Klunniy
 */
public class Main {
    public static void main(String[] args) {
        Class<SomeObject> someObjectClass = SomeObject.class;
//        int classModifiers = someObjectClass.getModifiers();

//        System.out.println(Modifier.isPublic(classModifiers));
//
//        Package myPackage = someObjectClass.getPackage();
//        System.out.println(myPackage);
//
//
//        Class superclass = someObjectClass.getSuperclass();
//        System.out.println(superclass);
//
//        Class[] interfaces = superclass.getInterfaces();
//        System.out.println(Arrays.toString(interfaces));

        Constructor[] constructors = someObjectClass.getConstructors();
//        System.out.println(Arrays.toString(constructors));

        Field[] fields = someObjectClass.getDeclaredFields();
        System.out.println(Arrays.toString(fields));

    }
}
