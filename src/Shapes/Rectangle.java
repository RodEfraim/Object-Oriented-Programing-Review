package Shapes;

public class Rectangle extends Shape {

    protected double length;
    protected double width;

    public Rectangle(){
        super();
        length = 1.0;
        width = 1.0;
    }

    public Rectangle(double length, double width){
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String color, Boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    /** Returns the length of this Shape.Rectangle instance */
    public double getLength() {
        return length;
    }

    /** Sets the length of this Shape.Rectangle instance */
    public void setLength(double length) {
        this.length = length;
    }

    /** Returns the width of this Shape.Rectangle instance */
    public double getWidth() {
        return width;
    }

    /** Sets the width of this Shape.Rectangle instance */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Returns the area of this Shape.Rectangle instance */
    @Override
    public double getArea() {
        return length*width;
    }

    /** Returns the perimeter of this Shape.Rectangle instance */
    @Override
    public double getPerimeter() {
        return (2*length) + (2*width);
    }

    /** Return a self-descriptive string of this instance in the form of Rectangle[width=?,length=?] */
    @Override
    public String toString() {
        return "A Rectangle with width= " + width + "and length= " + length + ", which is a subclass of " + super.toString() + "";
    }
}
