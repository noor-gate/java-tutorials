import java.util.HashSet;
import java.util.Set;

public class PrintBook {

    public static void main(String[] args) {

        Set<Book> set = new HashSet<Book>();

        Book book = new Book(1, "C++");

        set.add(book);

        set.add(new Book(2, "Haskell"));


        // this book has the same isbn as the first book added so by the definition of equality it is the
        // same book, therefore it will not be added and the book with title "C++" will be printed
        set.add(new Book(1, "Java"));
        book.setTitle("New C++ book");

        for (Book b : set) {
            System.out.println(b);
        }

    }

}