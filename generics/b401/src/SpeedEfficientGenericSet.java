import java.util.*;

public class SpeedEfficientGenericSet<T> implements GenericSet<T> {

    private Set<T> genericSet;

    public SpeedEfficientGenericSet() {
        genericSet = new HashSet<>();
    }

    @Override
    public void add(T x) {
        genericSet.add(x);
    }

    @Override
    public boolean remove(T x) {
        return genericSet.remove(x);
    }

    @Override
    public boolean isEmpty() {
        return genericSet.isEmpty();
    }

    @Override
    public boolean contains(T x) {
        return genericSet.contains(x);
    }
}
