import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class StringStackListIterator implements StringStackIterator {

    private ListIterator<String> stackIterator;

    public StringStackListIterator(ListIterator<String> stackIterator) {
        this.stackIterator = stackIterator;
    }

    @Override
    public boolean hasNext() {
        return stackIterator.hasPrevious();
    }

    @Override
    public String next() {
        if (hasNext()) {
            return stackIterator.previous();
        }
        return null;
    }
}
