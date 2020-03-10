import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringStackList implements StringStack {
    private List<String> stack;

    public StringStackList() {
        stack = new LinkedList<>();
    }

    @Override
    public void push(String s) {
        stack.add(s);
    }

    @Override
    public String pop() {
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
