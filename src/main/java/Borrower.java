import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book>books;

    public Borrower(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getBookCount(){
        return this.books.size();
    }

    public void borrowBook(Book book, Library library){
        this.books.add(book);
        library.lendBook(book);
    }
}
