import java.util.*;

public class SpeedEfficientGenericSet<T> implements GenericSet<T> {

    private Set<T> integerSet;

    public SpeedEfficientGenericSet() {
        integerSet = new HashSet<>();
    }

    @Override
    public void add(T x) {
        integerSet.add(x);
    }

    @Override
    public boolean remove(T x) {
        return integerSet.remove(x);
    }

    @Override
    public boolean isEmpty() {
        return integerSet.isEmpty();
    }

    @Override
    public boolean contains(T x) {
        return integerSet.contains(x);
    }


}
