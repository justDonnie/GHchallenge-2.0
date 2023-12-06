package implementations;

import models.Book;
import models.DataBase;
import models.Library;
import service.BookService;
import service.LibraryService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookImpl implements BookService {

    private final LibraryService libraryService;

    public BookImpl(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @Override
    public Book saveBook(Long libraryId, Book book) {
       Library library= libraryService.getLibraryById(libraryId);
       library.setBook(book);
       return book;
    }

    @Override
    public List<Book> getAllBooks(Long id) {
        Library library = libraryService.getLibraryById(id);
        return library.getBooks();
    }
    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        Library library = libraryService.getLibraryById(libraryId);
        for (Book f:library.getBooks()) {
            if (bookId.equals(f.getID())){
                return f;
            }
        }
        return null;
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        Library library = libraryService.getLibraryById(libraryId);
        for (Book f:library.getBooks()) {
            if (bookId.equals(f.getID())){
                library.getBooks().remove(f);
                return "The last book is successfully deleted!!!";
            }
        }

        return null;
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        for (Library h: libraryService.getAllLibraries()){
            if (libraryId.equals(h.getID())){
                h.setBooks(null);
                System.out.println("Successfully cleared!!!");
            }
        }
    }
}
