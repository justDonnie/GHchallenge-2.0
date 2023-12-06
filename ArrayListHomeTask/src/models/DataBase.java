package models;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Library>libraries = new ArrayList<>();
    private List<Book>books = new ArrayList<>();
    private List<Reader>readers = new ArrayList<>();

    public DataBase(List<Library> libraries, List<Book> books, List<Reader> readers) {
        this.libraries = libraries;
        this.books = books;
        this.readers = readers;
    }
    public List<Library> getLibraries() {
        return libraries;
    }

    public void setLibraries(List<Library> libraries) {
        this.libraries = libraries;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

}
