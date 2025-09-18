package OOP_BOOK;

import java.util.*;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList();
        int choice;

        do {
            System.out.println("====== MENU ======");
            System.out.println("1. Add new TextBook");
            System.out.println("2. Add new ReferenceBook");
            System.out.println("3. Update book by id");
            System.out.println("4. Delete book by id");
            System.out.println("5. Find book by id");
            System.out.println("6. Display all books");
            System.out.println("7. Find the most expensive book");
            System.out.println("8. Count TextBooks and ReferenceBooks");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter id: ");
                    String tid = sc.nextLine();
                    System.out.print("Enter title: ");
                    String ttitle = sc.nextLine();
                    System.out.print("Enter base price: ");
                    double tprice = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter subject: ");
                    String subject = sc.nextLine();
                    bookList.addBook(new TextBook(tid, ttitle, tprice, subject));
                    break;
                case 2:
                    System.out.print("Enter id: ");
                    String rid = sc.nextLine();
                    System.out.print("Enter title: ");
                    String rtitle = sc.nextLine();
                    System.out.print("Enter base price: ");
                    double rprice = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter publisher: ");
                    String publisher = sc.nextLine();
                    bookList.addBook(new ReferenceBook(rid, rtitle, rprice, publisher));
                    break;
                case 3:
                    System.out.print("Enter book id to update: ");
                    String uid = sc.nextLine();
                    if (bookList.updateBookById(uid)) {
                        System.out.println("Updated successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter book id to delete: ");
                    String did = sc.nextLine();
                    if (bookList.deleteBookById(did)) {
                        System.out.println("Deleted successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter book id to find: ");
                    String fid = sc.nextLine();
                    Book found = bookList.findBookById(fid);
                    if (found != null) {
                        found.displayDetails();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 6:
                    bookList.displayAllBooks();
                    break;
                case 7:
                    Book mostExpensive = bookList.findMostExpensiveBook();
                    if (mostExpensive != null) {
                        System.out.println("Most expensive book:");
                        mostExpensive.displayDetails();
                    } else {
                        System.out.println("No books in the list.");
                    }
                    break;
                case 8:
                    bookList.countBooks();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}
