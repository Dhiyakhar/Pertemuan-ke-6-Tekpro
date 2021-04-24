package p6;

/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }
    
    //*Jawaban Exercise 1 (pada baris ke-25 sampai ke-36)*//
    public Circle(double radius, String color) {	//Constructor Circle(radius :double, color :string)
        this.radius = radius;
        this.color = color;
    }

    public void setColor(String color) {			//variable color : string
        this.color = color;
    }

    public String getColor() {						//Getter and setter for color
        return this.color;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return a self-descriptive string of this instance in the form of
     * Circle[radius=?,color=?]
     */
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}