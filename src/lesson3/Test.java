package lesson3;

import java.util.Optional;

/**
 * @author Sergey Klunniy
 */
public class Test {

    public static void main(String[] args) {
        Optional<String> s = Optional.of("input");
        System.out.println(s.map(Test::getOutput));
        System.out.println(s.flatMap(Test::getOutputOpt));
    }

    private static String getOutput(String input) {
        return input == null ? null : "outpur for " + input;
    }

    private static Optional<String> getOutputOpt(String input) {
        return input == null ? Optional.empty() : Optional.of("output for " + input);
    }
}
