public class Square extends Rectangle {
    public Square() {
        super();
    }
    
    //Square has no instance variable, but inherits the instance variables width and length from its superclass Rectangle
    // Call superclass Rectangle(double, double)
    public Square(double side) {		
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    
    //Do you need to override the getArea()and getPerimeter()? No.
    
    //Override  thes setWidth()
    public void setWidth(double side) {		
        super.setWidth(side);
        super.setLength(side);
    }
    
  //Override  the setLength()
    public void setLength(double side) {	
        super.setWidth(side);
        super.setLength(side);
    }
    
    //Override the toString()
    public String toString() {	
        return "A Square with side=" + this.getSide() + ", which is a subclass of " + super.toString();
    }
}