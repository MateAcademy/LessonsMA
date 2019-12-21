package lesson1.lib;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Sergey Klunniy
 * @Retention(RetentionPolicy.RUNTIME) означает что с нашей аннотацией можно работать
 * в реальном времени и как-то ее обрабатывать
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Dao {
}
