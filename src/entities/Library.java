package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public Library(){

    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }
    public void listBooks(){
        for(Book b: books){
            System.out.println(b);
        }
    }

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }
    public void listUsers(){
        for(User u : users){
            System.out.println(u);
        }
    }



}
