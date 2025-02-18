package entities;

import java.text.SimpleDateFormat;
import java.util.*;

public class User {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String name;
    private Long IdUser;
    private Date BirthDate;
    private List<Book> books = new ArrayList<>();

    public User(){

    }

    public User(String name,Date date, Long IdUser){
        this.BirthDate = date;
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

    public void addBooks(Book book){
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

    public String toString(){
        return getName()+ " ,Id:"+getIdUser()+" BirthDate :"+sdf.format(BirthDate);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(IdUser, user.IdUser);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(IdUser);
    }
}
