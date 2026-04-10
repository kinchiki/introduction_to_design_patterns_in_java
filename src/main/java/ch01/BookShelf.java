package ch01;

// 自作　Iterator は使わない
import java.util.Iterator;
import java.util.ArrayList;

public class BookShelf implements Aggregate<Book> {
    private ArrayList<Book> books;

    public BookShelf(int initialize) {
        this.books = new ArrayList<>(initialize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}

