package Shapes;

public class Square extends Rectangle{

    Square() {
        super();
    }

    Square(Double side){
        super(side, side);
    }

    Square(Double side, String color, Boolean filled){
        super(side, side, color, filled);
    }

    /** Returns the length of this Shape.Rectangle.Square instance */
    public double getSide() {return super.getLength();}

    /** Sets the length of this Shape.Rectangle.Square instance */
    public void setSide(double side) {setLength(side);}

    /** Sets the width of this Shape.Rectangle.Square instance */
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /** Sets the length of this Shape.Rectangle.Square instance */
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /** Return a self-descriptive string of this instance in the form of Square[side=?] */
    @Override
    public String toString() {
        return "A Square with side= " + getSide() + ", which is a subclass of " + super.toString();
    }
}
