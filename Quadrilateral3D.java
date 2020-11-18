import java.awt.*;


/** Represents 90° angle quadrilateral 3D shapes */
public class Quadrilateral3D extends Shape3D {

	public Quadrilateral3D(int id, String name, String description, Color color, double height, double width, double length) {
		super(id, name, description, color, height, width, length);
	}
	
	/** 𝑎𝑟𝑒𝑎 􏰅= 2 􏰇 􏰀width 􏰇 height 􏰈 width 􏰇 length 􏰈 height 􏰇 length􏰁 */
	public double area() {
		double a = (2 * (width * height + width * length + height * length));
		return a;
	}
	
	/** 𝑝𝑒𝑟𝑖𝑚𝑒𝑡𝑒𝑟 =􏰅 4 􏰇 􏰀width 􏰈 height 􏰈 length􏰁 */
	public double perimeter() {
		double p = (4 * (width + height + length));
		return p;
	}
}
