//Two instance variables width(double) and length(double)
//The Rectangle class contains :
public class Rectangle extends Shape{
    private double width;
    private double length;
    
    //Three constructors as shown.
    //The no-arg constructor initializes the width and length to 1.0
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    //Getter and setter for all the instance variables.
    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    //Methods getArea() and getPerimeter()
    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
    
    //Override  the toString() method inherited
    public String toString() {
        return "A Rectangle with width=" + this.getWidth() + " and length=" + this.getLength() + ", which is a subclass of " + super.toString();
    }
}