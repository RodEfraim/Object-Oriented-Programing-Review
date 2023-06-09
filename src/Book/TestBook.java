package Book;

import java.util.ArrayList;
import java.util.List;

public class TestBook {

    public static void main(String[] args){

        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Construct an author instance
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);  // Author's toString()


        Book dummyBook = new Book("Java for dummy", authors, 19.95, 99);  // Test Book's Constructor
        System.out.println(dummyBook);  // Test Book's toString()

        // Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Authors are: \n" + dummyBook.getAuthorNames());  // Author's toString()
//        System.out.println("Author's name is: " + dummyBook.getAuthors().getName());
//        System.out.println("Author's email is: " + dummyBook.getAuthors().getEmail());

        // Use an anonymous instance of Author to construct a Book instance
//        Book anotherBook = new Book("more Java",
//                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
//        System.out.println(anotherBook);  // toString()
    }
}
