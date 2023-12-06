package models;

import enumClass.Gender;
import enumClass.Genre;
import service.BookService;

import java.util.List;

public class Book {
    private Long ID;
    private String name;
    private String author;
    private Genre genre;


    public Book(Long ID, String name, String author, Genre genre) {
        this.ID = ID;
        this.name = name;
        this.author = author;
        this.genre = genre;
    }
    public Book(){
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "\nBook- " +
                "ID: " + ID +
                " name: " + name + '\'' +
                " author: " + author + '\'' +
                " genre: " + genre;
    }
}
