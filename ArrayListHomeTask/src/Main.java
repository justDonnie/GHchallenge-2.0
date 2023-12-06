import enumClass.Gender;
import enumClass.Genre;
import implementations.BookImpl;
import implementations.LibraryImpl;
import implementations.ReaderImpl;
import models.Book;
import models.DataBase;
import models.Library;
import models.Reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        List<Reader> readers = new ArrayList<>();
        List<Book> books = new ArrayList<>();
        List<Library> libraries = new ArrayList<>();
        DataBase dataBase = new DataBase(libraries, books, readers);
        LibraryImpl library = new LibraryImpl(dataBase);
        BookImpl book = new BookImpl(library);
        ReaderImpl reader = new ReaderImpl(dataBase);


        int b = 0;
        while (b < 22) {

            System.out.println("Choose these commands!" +
                    "\n 1 - Create and save libraries" +
                    "\n 2 - Get all list of libraries" +
                    "\n 3 - Get library by ID" +
                    "\n 4 - Update library" +
                    "\n 5 - Delete library" +
                    "\n 6 - Add and save books to library(by ID)" +
                    "\n 7 - Get all list of books" +
                    "\n 8 - Get book by ID" +
                    "\n 9 - Delete book by ID" +
                    "\n 10 - Clear list of books by library ID" +
                    "\n 11 - Set and save readers" +
                    "\n 12 - Get all list of readers" +
                    "\n 13 - Get reader by ID" +
                    "\n 14 - Update reader" +
                    "\n 15 - Assign readers to libraries");

            int a = new Scanner(System.in).nextInt();

            switch (a) {
                case 1:
                    System.out.println(library.saveLibrary(List.of(new Library(7702L, "State Library", " Chuy 175"))));
                    System.out.println(library.saveLibrary(List.of(new Library(7703L, "AUCA", " Tokombaev 135"))));
                    System.out.println(library.saveLibrary(List.of(new Library(7704L, "Manas", " Aini 35"))));
                    System.out.println(library.saveLibrary(List.of(new Library(7504L, "K.Bayalinov", "Chuy 115"))));
                    break;
                case 2:
                    System.out.println(library.getAllLibraries());
                    break;
                case 3:
                    System.out.println(library.getLibraryById(7702L));
                    break;
                case 4:
                    System.out.println(library.updateLibrary(7704L, new Library(7704L, "Gagarin", "Jibek Jolu 96")));
                    break;
                case 5:
                    System.out.println(library.deleteLibrary(7703L));
                    break;
                case 6:
                    System.out.println(book.saveBook(7702L, new Book(90006L, "Modern Design", "D.Gafurov", Genre.DESIGN)));
                    System.out.println(book.saveBook(7702L, new Book(90004L, "The Judge", "K. Marks", Genre.LAW)));
                    System.out.println(book.saveBook(7504L, new Book(90001L, "The ART", "Michelangelo", Genre.ART)));
                    System.out.println(book.saveBook(7704L, new Book(90002L, "History of HUMAN", "CH. Darwin", Genre.HISTORY)));
                    System.out.println(book.saveBook(7704L, new Book(90007L, "Around the WORLD", "Abel' Tasman", Genre.ENCYCLOPEDIA)));
                    System.out.println(book.saveBook(7504L, new Book(90009L, "h2o", "D.Mendeleev", Genre.CHEMISTRY)));
                    break;
                case 7:
                    System.out.println(book.getAllBooks(7702L));
                    break;
                case 8:
                    System.out.println(book.getBookById(7702L, 90006L));
                    break;
                case 9:
                    System.out.println(book.deleteBook(7702L, 90004L));
                    break;
                case 10:
                    book.clearBooksByLibraryId(7704L);
                    break;
                case 11:
                    reader.saveReader(new Reader(100010L, "Leo Messi", "leo@gmail.com", "+996700101010", Gender.MALE));
                    reader.saveReader(new Reader(100011L, "Andres Iniesta", "andres@gmail.com", "+996708080808", Gender.MALE));
                    reader.saveReader(new Reader(100012L, "Maria Leon", "masha@gmail.com", "+996700121212", Gender.FEMALE));
                    break;
                case 12:
                    System.out.println(reader.getAllReaders());
                    break;
                case 13:
                    System.out.println(reader.getReaderById(100010L));
                    break;
                case 14:
                    System.out.println(reader.updateReader(100011L, new Reader(100011L, "Jennifer Anniston", "jenni@gmail.com", "+996555221004", Gender.FEMALE)));
                    break;
                case 15:
                    reader.assignReaderToLibrary(100012L, 7704L);
                    reader.assignReaderToLibrary(100011L, 7504L);
                    break;
                default:
                    System.out.println(
                            ("Choose only these commands!!!" +
                                    "\n 1 - Create and save libraries" +
                                    "\n 2 - Get all list of libraries" +
                                    "\n 3 - Get library by ID" +
                                    "\n 4 - Update library" +
                                    "\n 5 - Delete library" +
                                    "\n 6 - Add and save books to library(by ID)" +
                                    "\n 7 - Get all list of books" +
                                    "\n 8 - Get book by ID" +
                                    "\n 9 - Delete book by ID" +
                                    "\n 10 - Clear list of books by library ID" +
                                    "\n 11 - Set and save readers" +
                                    "\n 12 - Get all list of readers" +
                                    "\n 13 - Get reader by ID" +
                                    "\n 14 - Update reader" +
                                    "\n 15 - Assign readers to libraries"));
                    break;
            }
        }
    }
}








