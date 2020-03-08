import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static Stream<Integer> restrictToPositiveIntegers(Stream<? extends Number> numbers) {
        return numbers.map(Number::intValue).filter(x -> x > 0);
    }

    public static void main(String[] args) {
        List<Number> numbers = Arrays.asList(5, 5.5f, -3.4f);

        System.out.println("Positive integers from " + numbers + " are: "
                + restrictToPositiveIntegers(numbers.stream()).collect(Collectors.toList()));
    }
}
