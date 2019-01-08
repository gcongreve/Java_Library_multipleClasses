import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book1;
    private Book book2;
    private Book book3;
    private Library library;

    @Before
    public void Before(){
        library = new Library();
        book1 = new Book("1984", "George Orwell", "history");
        book2 = new Book("1985", "Jim Orwell",  "future");
        book3 = new Book("1986", "James Orwell",  "comedy");
    }

    @Test
    public void canHaveCapacity(){
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void canStartEmpty(){
        assertEquals(0, library.getBookNumber());
    }

    @Test
    public void canTakeInBooks(){
        library.addBook(book1);
        assertEquals(1, library.getBookNumber());
    }

    @Test
    public void canTakeInBooksUntilCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.getBookNumber());
    }

    @Test
    public void canLendBook(){
        library.addBook(book1);
        Book lentBook = library.lendBook();
        assertEquals(book1, lentBook);
        assertEquals(0, library.getBookNumber());
    }


}
