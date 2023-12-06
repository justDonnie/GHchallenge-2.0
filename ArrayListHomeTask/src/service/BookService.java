package service;

import models.Book;
import models.Library;

import java.util.List;

public interface BookService {
    Book saveBook(Long libraryId, Book book);
    List<Book>getAllBooks(Long id);
    Book getBookById(Long libraryId, Long bookId);
    String deleteBook(Long libraryId, Long bookId);
    void clearBooksByLibraryId(Long libraryId);


}
