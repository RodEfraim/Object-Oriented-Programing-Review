package Book;

/**
 * NOTE: How there is a "has" relationship between Book and Author, because Book contains
 * a variable of type Author.
 */
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book (String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book (String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public String getAuthorNames() {
        String authorNames = "";

        for(Author i : authors)
            authorNames += i.getName() + "\n";

        return authorNames;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    private String toStrings(){
        String toStrings = "";

        for(Author i : authors)
            toStrings += i.toString() + " ";

        return toStrings;
    }

    public String toString() {

        return "Book[name=" + name + " authors= " + toStrings() + " price=" + price + " qty=" + qty + "]";
    }
}
