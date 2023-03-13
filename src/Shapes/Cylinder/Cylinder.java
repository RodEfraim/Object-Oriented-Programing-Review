package Shapes.Cylinder;

import Shapes.Circle;

public class Cylinder extends Circle {

    private double height;  // private variable

    // Constructor with default color, radius and height
    public Cylinder() {
        super();        // call superclass no-arg constructor Circle()
        height = 1.0;
    }
    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super();        // call superclass no-arg constructor Circle()
        this.height = height;
    }
    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius);  // call superclass constructor Circle(r)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    /** Returns the area of this Shape.Cylinder instance */
    @Override
    public double getArea() {
        return (2  * Math.PI * getRadius() * height) + (2 * super.getArea());
    }

    /**
     * A public method for computing the volume of cylinder
     * use superclass method getArea() to get the base area.
     *
     * NOTE: If you override the getArea() in the subclass Cylinder, the getVolume() no longer works.
     * This is because the getVolume() uses the overridden getArea() method found in the same class.
     * (Java runtime will search the superclass only if it cannot locate the method in this class).
     *
     * After overridding the getArea() in subclass Cylinder, you can choose to invoke the getArea() of the
     * superclass Circle by calling super.getArea(). Since the equation is V=πr2h better to reuse code.
     */
    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()  // use Circle's toString()
                + " height=" + height;    }
}
