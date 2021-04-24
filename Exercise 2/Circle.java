//Write two subclasses of Shape called Circle
public class Circle extends Shape{
    private double radius;
    
    //Three constructors as shown.
    public Circle() {	
        super();
        this.radius = 1.0;
    }

    //An instance variable radius(double)
    public Circle(double radius) {	
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    //Getter and setter for the instance variable radius
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    //Methods
    public double getArea() {				//Method untuk mengukur luas lingkaran
        return Math.PI *getRadius() * getRadius();
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();	//Method untuk mengukur luas keliling
    }
    
    //Override the toString()
    public String toString() {
        return "A Circle with radius " + this.getRadius() + ", which is a subclass of " + super.toString();
    }
}