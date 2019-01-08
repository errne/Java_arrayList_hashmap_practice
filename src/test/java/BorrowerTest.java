import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BorrowerTest {
    private Borrower tom;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;

    @Before
    public void before(){
        tom = new Borrower("Tom");
        library = new Library(4);
        book1 = new Book("Umberto Eco", "Baudolino", "fiction");
        book2 = new Book("Umberto Eco", "Theory of Semiotics", "non-fiction");
        book3 = new Book("Umberto Eco", "Name of the Rose", "fiction");
        book4 = new Book("Thomas Mann", "Dr. Faustus", "fiction");
        book5 = new Book("H. P. Lovecraft", "The Call of Cthulhu", "horror");
        book6 = new Book("H. P. Lovecraft","The Shadow Out of Time", "horror");

    }

    @Test
    public void hasName() {
        assertEquals("Tom", tom.getName());
    }

    @Test
    public void canGetBookCount() {
        assertEquals(0, tom.getBookCount());
    }

    @Test
    public void canBorrowBook() {
        library.addBook(book5);
        library.addBook(book6);
        tom.borrowBook(book6, library);
        assertEquals(1, tom.getBookCount());
        assertEquals(1, library.getBookCount());
    }
}