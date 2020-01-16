import java.util.*;
import java.util.stream.Stream;

public class four {

    public static void main(String[] args) {
        List<Integer> intRange = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();
        List<String> intStr = new ArrayList<>();

        Random generator = new Random();

        int x = Integer.parseInt(args[0]);

        for (int i = 0; i < x; i++) {
            intRange.add(i);
        }

        int r;

        while (!ints.containsAll(intRange)) {
           r = generator.nextInt(x);
           ints.add(r);
           intStr.add(Integer.toString(r));
        }

        StringBuilder result = new StringBuilder();

        result.append("Generating random numbers:\n");
        result.append(String.join(", ", intStr) + "\n");
        result.append("I had to generate" + ints.size() + " random numbers between ");
        result.append(0 + " and " + (x - 1));
        result.append(" to have produced all such numbers at least once.");

        System.out.print(result);
    }


}
