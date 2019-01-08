import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;


    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<>();

    }

    public String getName() {
        return this.name;
    }


    public int collectionNumber() {
        return this.collection.size();
    }

    public void addBook(Book book){
        this.collection.add(book);
    }

    public void borrowBook(Library library, int numberOfBooks) {
        for (int i = 0; i < numberOfBooks; i++) {
            if (library.getBookNumber() > 0) {
                addBook(library.lendBook());
            }
        }
    }


}
