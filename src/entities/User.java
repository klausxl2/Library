package entities;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private Long IdUser;
    private List<Book> books = new ArrayList<>();

    public User(){

    }

    public User(String name, Long IdUser){
        this.name = name;
        this.IdUser = IdUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdUser() {
        return IdUser;
    }

    public void setIdUser(Long idUser) {
        IdUser = idUser;
    }

    public void addtBooks(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public void listBookUser(){
        for(Book b: books){
            System.out.println(b);
        }
    }

    public String toStringDetails(){
        return getName()+ " ,Id:"+getIdUser();
    }


}
