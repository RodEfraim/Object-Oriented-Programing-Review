package Shapes;

public class TestSquare {

    public static void main(String[] args) {
        // Test constructors and toString()
        // You need to append a 'f' or 'F' to a float literal
        Square square1 = new Square(); // default constructor
        System.out.println(square1);  // toString()
        Square square2 = new Square(5.0);
        System.out.println(square2);

        // Test setters and getters
        square1.setLength(5.6f);
        square1.setWidth(7.8f);
        System.out.println(square1);  // toString()
        System.out.println("length is: " + square1.getLength());
        System.out.println("width is: " + square1.getWidth());

        // Test getArea() and getPerimeter()
        System.out.printf("area is: %.2f%n", square1.getArea());
        System.out.printf("perimeter is: %.2f%n", square1.getPerimeter());
    }

}
