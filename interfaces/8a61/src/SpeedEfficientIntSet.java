import java.util.*;

public class SpeedEfficientIntSet implements IntSet {

    private Set<Integer> integerSet;

    public SpeedEfficientIntSet() {
        integerSet = new HashSet<>();
    }

    @Override
    public void add(int x) {
        integerSet.add(x);
    }

    @Override
    public boolean remove(int x) {
        return integerSet.remove(x);
    }

    @Override
    public boolean isEmpty() {
        return integerSet.isEmpty();
    }

    @Override
    public boolean contains(int x) {
        return integerSet.contains(x);
    }
}
