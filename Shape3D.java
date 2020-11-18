import java.awt.*;


/** Abstract classes which inherits from class 𝑆h𝑎𝑝𝑒 */
public abstract class Shape3D extends Shape2D {

	public final double length;
	
	/** The non‐default constructor initializes the class’ private fields*/
	public Shape3D(int id, String name, String description, Color color, double height, double width, double length) {
		super(id, name, description, color, height, width);
		this.length = length;
	}
	
	/** 𝑡𝑜𝑆𝑡𝑟𝑖𝑛𝑔: returns the same value described in the parent class but includes h𝑒𝑖𝑔h𝑡, 𝑤𝑖𝑑𝑡h, and 𝑙𝑒𝑛𝑔𝑡h fields.
The method must re‐use the parent class’ 𝑡𝑜𝑆𝑡𝑟𝑖𝑛𝑔 implementation */
	public String toString() {
		String ts = super.toString();
		String tos = ts + " " + length;
		return tos;
	}
	
	/** 𝑐𝑜𝑚𝑝𝑎𝑟𝑒𝑇𝑜 numerically compares two objects of type 𝑆h𝑎𝑝𝑒2𝐷 (or 𝑆h𝑎𝑝𝑒3𝐷). Returns the value 0 if both
	objects have the same 𝑖𝑑, 𝑛𝑎𝑚𝑒, 𝑑𝑒𝑠𝑐𝑟𝑖𝑝𝑡𝑖𝑜𝑛, 𝑤𝑖𝑑𝑡h, h𝑒𝑖𝑔h𝑡, and 𝑙𝑒𝑛𝑔𝑡h (for 𝑆h𝑎𝑝𝑒3𝐷 only). The 𝑐𝑜𝑚𝑝𝑎𝑟𝑒𝑇𝑜􏰀 􏰁 in 𝑆h𝑎𝑝𝑒2𝐷 
	must re‐use the 𝑐𝑜𝑚𝑝𝑎𝑟𝑒𝑇𝑜􏰀 􏰁 from the 𝑆h𝑎𝑝𝑒 class. The 𝑐𝑜𝑚𝑝𝑎𝑟𝑒𝑇𝑜􏰀 􏰁 in 𝑆h𝑎𝑝𝑒3𝐷 must reuse the 𝑐𝑜𝑚𝑝𝑎𝑟𝑒𝑇𝑜􏰀 􏰁 from the 𝑆h𝑎𝑢𝑢𝑝𝑒2𝐷 class*/
	public int compareTo(Shape other) {
		int r = super.compareTo(other);
		if((other instanceof Shape3D) && (r==0)) {
			Shape3D other1 = (Shape3D) other;
			double l1 = length;
			double l2 = other1.length;
			if(l1==l2) {
				return 0;
			}
			else {
				int l = (int) (l1-l2);
				return l;
			}
		}
		else {
			return r;
		}
	}
	
	/** 𝑔𝑒𝑡𝐷𝑖𝑚𝑒𝑛𝑠𝑖𝑜𝑛𝑠􏰀 􏰁: returns the values of the shape’s dimensions (𝑤𝑖𝑑𝑡h, h𝑒𝑖𝑔h𝑡, and 𝑙𝑒𝑛𝑔𝑡h). Use precision 2 and separate 
	 * each dimension with the an "𝑋". */
	public String getDimensions() {
		String str1 = super.getDimensions();
		String str2 = String.format("%.2f", length);
		String result = str1 + str2;
		return result;
	}
}
