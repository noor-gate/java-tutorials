import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static List<Integer> concatenate(List<List<Integer>> lists) {
        return lists.stream().reduce(Collections.emptyList(),
                (one, two) -> {
                two.addAll(one);
                return two;
                });
    }

    public static int findMin(List<Integer> lists) {
        return lists.stream().reduce(Integer.MAX_VALUE, Math::min);
    }

    public static int findMinOrZero(List<Integer> lists) {
        return lists.stream().reduce(Math::min).orElse(0);
    }

    public static int findMax(List<Integer> lists) {
        return lists.stream().reduce(Integer.MIN_VALUE, (one, two) -> Math.max(one, two));
    }

    public static int findMaxOrZero(List<Integer> lists) {
        return lists.stream().reduce((one, two) -> Math.max(one, two)).orElse(0);
    }

    public static int findMinOfMaxes(List<List<Integer>> listOfLists) {
        return findMin(listOfLists.stream()
                .map(Example::findMax)
                .collect(Collectors.toList()));

    }

}
