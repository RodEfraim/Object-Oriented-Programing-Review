package GeometricObject;

public class Rectangle implements GeometricObject{

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
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

    /** Return a self-descriptive string of this instance*/
    public String toString() {
        return "A Rectangle with width = " + width + " and length = " + length + ", which is a subclass of " + super.toString() + "";
    }
}
