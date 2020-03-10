public class StringStackArray implements StringStack {
    private String[] stack;
    int currentPosition;

    public StringStackArray() {
        stack = new String[100];
        currentPosition = 0;
    }

    @Override
    public void push(String s) {
        if (currentPosition < 100) {
            stack[currentPosition] = s;
            currentPosition ++;
        }
    }

    @Override
    public String pop() {
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
