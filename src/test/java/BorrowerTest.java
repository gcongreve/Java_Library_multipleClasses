import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {


    private Book book1;
    private Book book2;
    private Book book3;
    private Library library;
    private Borrower borrower;

    @Before
    public void Before(){
        book1 = new Book("1984", "George Orwell", "history");
        book2 = new Book("1985", "Jim Orwell",  "future");
        book3 = new Book("1986", "James Orwell",  "comedy");
        library = new Library();
        borrower = new Borrower("James");
    }

    @Test
    public void canHaveName(){
        assertEquals("James", borrower.getName());
    }

    @Test
    public void startsWithEmptyCollection(){
        assertEquals(0, borrower.collectionNumber());
    }

    @Test
    public void canAddBookToCollection(){
        borrower.addBook(book1);
        assertEquals(1, borrower.collectionNumber());
    }

    @Test
    public void canTakeBookFromLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        borrower.borrowBook(library, 1);
        assertEquals(1, library.getBookNumber());
        assertEquals(1, borrower.collectionNumber());
    }

    @Test
    public void canTakeMultipleBooksFromLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        borrower.borrowBook(library, 2);
        assertEquals(0, library.getBookNumber());
        assertEquals(2, borrower.collectionNumber());
    }



}
