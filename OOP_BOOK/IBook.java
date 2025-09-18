package OOP_BOOK;

import java.util.*;

public interface IBook {

    void addBook(Book book);

    boolean updateBookById(String id);

    void displayDetails();

    double calculatePrice();
}
