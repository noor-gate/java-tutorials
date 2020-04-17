public class GenericStackArray<T> implements GenericStack<T> {
    private T[] stack;
    int currentPosition;

    @SuppressWarnings("unchecked")
    public GenericStackArray() {
        stack = (T[]) new Object[100];
        currentPosition = 0;
    }

    @Override
    public void push(T s) {
        if (currentPosition < 100) {
            stack[currentPosition] = s;
            currentPosition ++;
        }
    }

    @Override
    public T pop() {
        if (currentPosition > 0) {
            currentPosition--;
            return stack[currentPosition];
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return currentPosition == 0;
    }

}
