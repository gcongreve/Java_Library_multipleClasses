import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Find Spot", "Some Guy", "comedy");

    }

    @Test
    public void bookHasTitle(){
        assertEquals("Find Spot", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Some Guy", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("comedy", book.getGenre());
    }


}
