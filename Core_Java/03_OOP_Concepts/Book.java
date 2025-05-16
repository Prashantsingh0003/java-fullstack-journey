public class Book {
    //Getter & Setter + Encapsulation
    private String title;
    private double price;

    // Setters
    public void setTitle(String t) {
        title = t;
    }

    public void setPrice(double p) {
        price = p;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Java Basics");
        b.setPrice(450.50);

        System.out.println("Book Title: " + b.getTitle());
        System.out.println("Price: ₹" + b.getPrice());
    }
}
