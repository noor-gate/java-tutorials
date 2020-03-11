import java.util.LinkedList;
import java.util.List;

public class GenericStackList<T> implements GenericStack<T> {
    private List<T> stack;

    public GenericStackList() {
        stack = new LinkedList<>();
    }

    @Override
    public void push(T s) {
        stack.add(s);
    }

    @Override
    public T pop() {
        if (stack.size() > 0) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

}
