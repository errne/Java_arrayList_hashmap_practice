import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class BookTest {
    private Book book1;

    @Before
    public void before(){
       book1 = new Book("Umberto Eco", "Baudolino", "fiction");
    }

    @Test
    public void hasTitle(){
        assertEquals("Baudolino", book1.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Umberto Eco", book1.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("fiction", book1.getGenre());
    }


}
