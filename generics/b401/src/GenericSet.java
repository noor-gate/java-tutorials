public interface GenericSet<T> {
    public void add(T x);

    public boolean remove(T x);

    public boolean isEmpty();

    public boolean contains(T x);
}
