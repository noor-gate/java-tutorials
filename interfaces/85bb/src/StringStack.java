public interface StringStack {
    public void push(String s);

    public String pop();

    public boolean isEmpty();

    public StringStackIterator iterator();
}
