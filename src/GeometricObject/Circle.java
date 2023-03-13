package GeometricObject;

public class Circle implements GeometricObject{
    // private instance variable, not accessible from outside this class
    private double radius;

    /** Constructs a Shapes.Circle instance with the given radius and default color */
    public Circle(double radius) {  // 2nd constructor
        super();
        this.radius = radius;
    }

    /** Returns the area of this Circle instance */
    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    /** Returns the perimeter/circumference of this Circle instance */
    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    /** Return a self-descriptive string of this instance.*/
    public String toString() {
        return "A Circle with radius= " + radius + ", which is a subclass of " + super.toString() + "";
    }
}
