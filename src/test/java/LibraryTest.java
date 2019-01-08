import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Book book6;

    @Before
    public void before(){
        library = new Library(5);
        book1 = new Book("Umberto Eco", "Baudolino", "fiction");
        book2 = new Book("Umberto Eco", "Theory of Semiotics", "non-fiction");
        book3 = new Book("Umberto Eco", "Name of the Rose", "fiction");
        book4 = new Book("Thomas Mann", "Dr. Faustus", "fiction");
        book5 = new Book("H. P. Lovecraft", "The Call of Cthulhu", "horror");
        book6 = new Book("H. P. Lovecraft","The Shadow Out of Time", "horror");

    }

    @Test
    public void hasCapacity(){
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
       // assertEquals("Baudolino", );
    }

    @Test
    public void cannotAddBookIfFull(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        assertEquals(5, library.getBookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.lendBook(book3);
        assertEquals(3,library.getBookCount() );
    }

    @Test
    public void hasGenreList(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        int fictionCount = library.getGenreList().get("fiction");
        assertEquals(3, fictionCount);
    }


}