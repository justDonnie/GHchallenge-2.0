package models;

import service.LibraryService;

import java.util.ArrayList;
import java.util.List;

public class Library  {
    private Long ID;
    private String name;
    private String address;
    private List<Book>books;
    private List<Reader>readers;

    public Library(Long ID, String name, String address, List<Book> books, List<Reader> readers) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.books = books;
        this.readers = readers;
    }

    public Library(Long ID, String name, String address) {
        this.ID = ID;
        this.name = name;
        this.address = address;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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


    public void setBook(Book book){
        if(this.books==null){
            this.books=new ArrayList<>();
        }
       books.add(book);
    }
    public  void setReader(Reader reader){
        if (this.readers==null){
            this.readers=new ArrayList<>();

        }
        readers.add(reader);
    }




    @Override
    public String toString() {
        return "\nLibrary- " +
                "ID: " + ID +
                " name: " + name + '\'' +
                " address: " + address + '\'' +
                " books: " + books +
                " readers: " + readers;
    }
}
