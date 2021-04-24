//*a test program to test all the methods defined in Shape.*//

public class testShape {
    public static void main(String args[]) {
    	
    	// Declare and allocate a new instance of Shape
        // default color and fill
        Shape s1 = new Shape();
        System.out.println(s1);						//*mencetak method toString() dengan value pada shape sebelum value diubah.
        
        // Declare and allocate a new instance of Shape
        // specifying color and fill
        Shape s2 = new Shape("yellow", false);		//*value pada method color (string) dan filled (booelan) diubah.
        System.out.println(s2);						//*mencetak method toString() dengan value pada shape sebelum value diubah.

        //*two subclasses of Shape called Circle and Rectangle.*//
        
        // Declare and allocate a new instance of Circle
        // default color and fill
        Circle c1 = new Circle();
        System.out.println(c1);						//*mencetak method toString()
        System.out.println(c1.getPerimeter());		//*mencetak method yang mengembalikan nilai keliling lingkaran
        System.out.println(c1.getArea());			//*mencetak method yang mengembalikan nilai luas lingkaran
        
        // Declare and allocate a new instance of Rectangle
        // default color and fill
        Rectangle r1 = new Rectangle();
        System.out.println(r1);						//*mencetak method toString()
        
        // Declare and allocate a new instance of Square
        // specifying height, with default color and radius
        Square sq1 = new Square();
        System.out.println(sq1);					//*mencetak method toString()
    }
}