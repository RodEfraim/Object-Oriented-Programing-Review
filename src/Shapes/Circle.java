package Shapes;

public class Circle extends Shape{

    // private instance variable, not accessible from outside this class
    private double radius;

    // Constructors (overloaded)
    /** Constructs a Shapes.Circle instance with default value for radius and color */
    public Circle() {  // 1st (default) constructor
        super();
        radius = 1.0;
    }

    /** Constructs a Shapes.Circle instance with the given radius and default color */
    public Circle(double radius) {  // 2nd constructor
        super();
        this.radius = radius;
    }

    // 3rd constructor to construct a new instance of Circle with the given radius and color
    public Circle(double radius, String color, Boolean filled) {  // 3rd constructor
        super(color, filled);
        this.radius = radius;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /**
     * If there is a need to change the values of radius of a Circle instance after
     * it is constructed, then add public methods called setter for changing the radius
     * of a Circle instance as follows:
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Returns the area of this Shape.Circle instance */
    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    /** Returns the perimeter/circumference of this Shape.Circle instance */
    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    /** Return a self-descriptive string of this instance.*/
    public String toString() {
        //return "Circle[" + super.toString() + ", radius: " + radius + "]";
        return "A Circle with radius= " + radius + ", which is a subclass of " + super.toString() + "";
    }

}
