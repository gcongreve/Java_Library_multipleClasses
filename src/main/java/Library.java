import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> collection;
    private HashMap<String, Integer> genreNumbers;

    public Library(){
        this.capacity = 2;
        this.collection = new ArrayList<Book>();
        this.genreNumbers = new HashMap<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getBookNumber() {
        return this.collection.size();
    }


    public void addBook(Book book) {
        if (collection.size() < this.getCapacity()) {
            this.collection.add(book);
        }
    }

    public Book lendBook() {
        return this.collection.remove(0);
    }



}
