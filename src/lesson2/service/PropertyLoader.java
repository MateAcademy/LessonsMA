package lesson2.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Sergey Klunniy
 */
public class PropertyLoader {

    public static String getProperty(String name) throws IOException {
        Path property = Paths.get("application.properties");
        String propertyByteString = new String(Files.readAllBytes(property));
        String result = propertyByteString.split("=")[1];
        return result;
    }
}
