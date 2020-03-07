import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Character.isDigit;

public class Example {
    public static List<String> reverseEachString(List<String> input) {
        return input.stream()
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .map(StringBuilder::toString)
                .collect(Collectors.toList());
    }

    public static List<String> reverseEachStringMonolithic(List<String> input) {
        return input.stream()
                .map(x -> (new StringBuilder(x)).reverse().toString())
                .collect(Collectors.toList());
    }

    public static List<Double> sqrtsOfFirstDigits(List<String> input) {
        return input.stream()
                .filter(x -> isDigit(x.charAt(0)))
                .map(x -> Integer.valueOf(x.substring(0, 1)))
                .map(Math::sqrt)
                .collect(Collectors.toList());
    }

    public static List<Double> sqrtsOfFirstDigitsMonolithic(List<String> input) {
        return input.stream()
                .filter(x -> isDigit(x.charAt(0)))
                .map(x -> Math.sqrt(Integer.parseInt(x.substring(0, 1))))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> example = Arrays.asList("hello", "world");
        List<String> example2 = Arrays.asList("4hello", "9world");

        System.out.println(reverseEachString(example));
        System.out.println(reverseEachStringMonolithic(example));

        System.out.println(sqrtsOfFirstDigits(example2));
        System.out.println(sqrtsOfFirstDigitsMonolithic(example2));
    }

}
