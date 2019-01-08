import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book>collection;
    private int capacity;
    private HashMap<String, Integer>genreList;

    public Library(int capacity) {
        this.capacity = capacity;
        collection = new ArrayList<>();
        genreList = new HashMap<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBookCount(){
        return this.collection.size();
    }

    public void addBook(Book book){
        //if (getBookCount()<this.capacity) {
        if (!isFull()){
            this.collection.add(book);
            addToGenreList(book.getGenre());
        }
    }

    public Boolean isFull(){
        if (getBookCount() == this.capacity){
            return true;
        } else {
            return false;
        }
    }

    public void lendBook(Book book){
        this.collection.remove(book);
    }

    public void addToGenreList(String genre){
        Integer count = genreList.containsKey(genre) ? genreList.get(genre) : 0;
        genreList.put(genre, count + 1);

//        if (genreList.containsKey(genre)){
//            genreList.get(genre)++;
//        }
    }

    public HashMap<String, Integer> getGenreList() {
        return genreList;
    }
}
