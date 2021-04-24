//Two instance variables color(String) and filled(boolean)
public class Shape {
    private String color;
    private boolean filled;

    //a  no-arg (no-argument) constructor that initializes the color to "green" and filled to true
    public Shape() {			
        this.color = "green";
        this.filled = true;
    }

    // a constructor that initializes the color and filled to the given values
    public Shape(String color, boolean filled) { 
        this.color = color;
        this.filled = filled;
    }

    //Getter and setter for all the instance variables.
    public String getColor() { 
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    //A toString() method that returns "A Shape with color of xxx and filled/Not filled"
    public String toString() {	
        return "A shape with color of " + getColor() + " and" + (isFilled() ? "" : " not") + " filled";
    }
}