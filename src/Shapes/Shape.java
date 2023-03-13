package Shapes;

/**
 * Abstract class: is a restricted class that cannot be used to create objects (to access it,
 * it must be inherited from another class).
 *
 * Abstract method: can only be used in an abstract
 * class, and it does not have a body. The body is provided by the subclass (inherited from).
 *
 * Not all methods in an abstract class have to be abstract methods. An abstract class can have
 * a mixture of abstract and non-abstract methods. Subclasses of an abstract class must
 * implement (override) all abstract methods of its abstract superclass.
 */
abstract public class Shape {

    protected String color;
    protected Boolean filled;

    Shape() {
        color = "red";
        filled = true;
    }

    Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /** Returns the color.*/
    public String getColor() {
        return color;
    }
    /** Sets the color.*/
    public void setColor(String color) {this.color =  color;}
    /**
     * Returns whether or not its filled.
     */
    public Boolean isFilled() {return filled;}
    /**
     * Sets the boolean value.
     */
    public void setFilled(Boolean filled) {this.filled = filled;}

    /**
     * Shape is an abstract class containing 2 abstract methods: getArea() and getPerimeter(), where its
     * concrete subclasses must provide its implementation. Mark all the overridden
     * methods with annotation @Override.
     */
    abstract public double getArea();
    abstract public double getPerimeter();


    /** Return a self-descriptive string of this instance in the form of Shape[color=?,filled=?] */
    public String toString() {
        //return "Shape[color=" + color + " filled=" + filled + "]";
        String filledString;
        if(isFilled())
            filledString = "filled";
        else
            filledString = "not filled";
        return "a Shape with color of " + color + " and " + filledString + ".";
    }
}
