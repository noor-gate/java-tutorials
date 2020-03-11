import java.util.Iterator;

public class StringStackArrayIterator implements StringStackIterator {

    private String[] stack;
    private int stackPointer;

    public StringStackArrayIterator(String[] stack, int stackPointer) {
        this.stack = stack;
        this.stackPointer = stackPointer - 1;
    }

    @Override
    public boolean hasNext() {
        return stackPointer >= 0;
    }

    @Override
    public String next() {
        if (hasNext()) {
            String result = stack[stackPointer];
            stackPointer --;
            return result;
        }
        return null;
    }
}
