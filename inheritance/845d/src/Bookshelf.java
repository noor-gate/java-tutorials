import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Bookshelf {

    private List<Book> bookshelf;

    public Bookshelf() {
        this.bookshelf = new LinkedList<>();
    }

    public int size() {
        return bookshelf.size();
    }

    public void addBookOnLeftSide(Book b) {
        addBook(0, b);
    }

    public void addBookOnRightSide(Book b) {
        addBook(size(), b);
    }

    public void addBook(int i, Book b) {
        bookshelf.add(i, b);
    }

    public Book remove(int i) {
        return bookshelf.remove(i);
    }

    public void printLeftToRight() {
        for (Book b : bookshelf) {
            System.out.println(b.toString());
        }
    }

    public void printRightToLeft() {
        ListIterator<Book> iter = bookshelf.listIterator(size());
        while (iter.hasPrevious()) {
            System.out.println(iter.previous());
        }
    }
}
