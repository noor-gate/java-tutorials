public interface IntSet {
    public void add(int x);

    public boolean remove(int x);

    public boolean isEmpty();

    public boolean contains(int x);

    public boolean contains(IntSet other);

    public IntSetIterator iterator();

    public void addAll(IntSet other);

    public void removeAll(IntSet other);
}
