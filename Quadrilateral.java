import java.awt.*;

/** Represents 90° angle quadrilateral 2D shapes 
 * Inherits from class 𝑆h𝑎𝑝𝑒 */
public class Quadrilateral extends Shape2D {

	public Quadrilateral(int id, String name, String description, Color color, double height, double width) {
		super(id, name, description, color, height, width);
	}
	
	/** 𝑎𝑟𝑒𝑎 =􏰅 width 􏰇 height */
	public double area() {
		double a = (width * height);
		return a;
	}
	
	/** 𝑝𝑒𝑟𝑖𝑚𝑒𝑡𝑒𝑟 =􏰅 2 􏰇 􏰀width 􏰈 height􏰁 */
	public double perimeter() {
		double p = (2 * (width + height));
		return p;
	}
}
