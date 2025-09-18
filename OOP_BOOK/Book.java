package OOP_BOOK;

abstract class Book implements IBook {

    private String id;
    private String title;
    private double basePrice;

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public void addBook(Book book) {

    }

    @Override
    public boolean updateBookById(String id) {
        return false;
    }

    @Override
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Base Price: " + basePrice);
    }

    @Override
    public abstract double calculatePrice();

}
