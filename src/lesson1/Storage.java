package lesson1;

import java.util.NoSuchElementException;

/**
 * @author Sergey Klunniy
 */
public class Storage implements AutoCloseable{
    @Override
    public void close()  {
        System.out.println("выполняем закрітие ресурсов");
        throw new NoSuchElementException();
    }
}
