import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Example {
    static <T> List<T> concatenate(List<List<T>> lists) {
        return lists.stream().reduce(Collections.emptyList(), (one, two) -> {
            two.addAll(one);
            return two;
        });
    }

    static <S, T> List<ImmutablePair<Optional<S>, Optional<T>>> zip(List<S> first, List<T> second) {
         int min = Math.min(first.size(), second.size());
         int max = Math.max(first.size(), second.size());
         List<ImmutablePair<Optional<S>, Optional<T>>> result = new ArrayList<>();

         for (int i = 0; i < min; i++) {
            result.add(new ImmutablePair<>(Optional.of(first.get(i)), Optional.of(second.get(i))));
         }

         for (int j = min; j < max; j++) {
            if (first.size() > second.size()) {
                result.add(new ImmutablePair<>(Optional.of(first.get(j)), Optional.empty()));
            } else {
                result.add(new ImmutablePair<>(Optional.empty(), Optional.of(second.get(j))));
            }
         }
         return result;
    }

    static <S, T> List<ImmutablePair<S, T>> flatten(List<ImmutablePair<Optional<S>, Optional<T>>> maybePairs, S defaultS, T defaultT) {

        List<ImmutablePair<S, T>> result = new ArrayList<>();

        for (int i = 0; i < maybePairs.size(); i++) {
            S first;
            T second;
            if (maybePairs.get(i).getFirst().isEmpty()) {
                first = defaultS;
            } else {
                first = maybePairs.get(i).getFirst().get();
            }

            if (maybePairs.get(i).getSecond().isEmpty()) {
                second = defaultT;
            } else {
                second = maybePairs.get(i).getSecond().get();
            }
            result.add(new ImmutablePair<>(first, second));
        }
        return result;
    }
}
