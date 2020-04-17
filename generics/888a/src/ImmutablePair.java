public class ImmutablePair<S, T> {
    private S first;
    private T second;

    public ImmutablePair(S first, T second) {
        this.first = first;
        this.second = second;
    }

    public S getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }


    @Override
    public String toString() {
        return "(" + first.toString() + ", " + second.toString() + ")";
    }
}
