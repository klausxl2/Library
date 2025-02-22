package entities;

import enums.Status;

import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class Book {

    private String name;
    private Long id;
    private String Details;
    private String Author;
    private Status status;

    public Book(){

    }

    public Book(String name,String Author,  String Details,Long id) {
        this.name = name;
        this.id = id;
        this.Details = Details;
        this.status = Status.Borrowed;
        this.Author = Author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String toString(){
        return name+ " ," +
                "Autor: "+Author+ " ,Detalhes: "+Details +" , Id: "+id;

    }

    public void loan(){
        this.status = Status.Borrowed;
    }
    public void returnBook(){
        this.status = Status.Available;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
