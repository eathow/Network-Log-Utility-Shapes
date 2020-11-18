import java.awt.Color;
import java.awt.*;


/** An abstract class which implements Java’s 𝐶𝑜𝑚𝑝𝑎𝑟𝑎𝑏𝑙𝑒 Interface
 * Contains two abstract methods, 𝑎𝑟𝑒𝑎 and 𝑝𝑒𝑟𝑖𝑚𝑒𝑡𝑒𝑟 */
public abstract class Shape implements Comparable<Shape> {
	
	protected final Integer id;
	protected final String name;
	protected final String description;
	protected Color color;
	
	public Shape(int id, String name, String description, Color color) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.color = color;
	}
	
	// Abstracts don't have bodies. So for right now, this is all we have
	public abstract double area(); 
	public abstract double perimeter(); 
		
	/** 𝑐𝑜𝑚𝑝𝑎𝑟𝑒𝑇𝑜: numerically compares two objects of type 𝑆h𝑎𝑝𝑒. Returns the value 0 if both objects have the same
	𝑛𝑎𝑚𝑒 and 𝑐𝑜𝑙𝑜𝑟. Use 𝑔𝑒𝑡𝐶𝑜𝑙𝑜𝑟𝑁𝑎𝑚𝑒􏰀 􏰁 when comparing colors. Note that the 𝑖𝑑 and 𝑑𝑒𝑠𝑐𝑟𝑖𝑝𝑡𝑖𝑜𝑛 fields are excluded here. Otherwise, 
	return the results of the first mismatch comparison between 𝑛𝑎𝑚𝑒 then 𝑐𝑜𝑙𝑜𝑟. In other words, if the two 𝑛𝑎𝑚𝑒 fields are the same return the results of comparing the two 𝑐𝑜𝑙𝑜𝑟 fields */
	public int compareTo(Shape other) {
		//dont have to compare color, need to compare ID 
		String c1 = this.getColorName();
		String n1 = this.name;
		String c2 = other.getColorName();
		String n2 = other.name;
		int r1 = c1.compareTo(c2);
		int r2 = n1.compareTo(n2);
		if(r2==0) {
			if(r1==0) {
				return 0;
			}
			else {
				return r1;
			} 
		}
		else{
			return r2;
		}
		//return r2;
		//fix later
	}
	
	/** 𝑡𝑜𝑆𝑡𝑟𝑖𝑛𝑔: returns a space‐delimited string of its fields:
  	II.
	≪ 𝑣𝑎𝑙𝑢𝑒 𝑜𝑓 𝑖𝑑 ≫ ≪ 𝑣𝑎𝑙𝑢𝑒 𝑜𝑓 𝑛𝑎𝑚𝑒 ≫ ≪ 𝑣𝑎𝑙𝑢𝑒 𝑜𝑓 𝑑𝑒𝑠𝑐𝑟𝑖𝑝𝑡𝑖𝑜𝑛 ≫ ≪ 𝑣𝑎𝑙𝑢𝑒 𝑜𝑓 𝑐𝑜𝑙𝑜𝑟 ≫ */
	public String toString() {
	    String tostring = id + " " + name + " " + description + " " + color;
		return tostring;
	}
	
	/** 𝑔𝑒𝑡𝐶𝑜𝑙𝑜𝑟𝑁𝑎𝑚𝑒: returns the name of the 𝐶𝑜𝑙𝑜𝑟 as a 𝑆𝑡𝑟𝑖𝑛𝑔. This method is simply the reverse implementation
	of 𝑔𝑒𝑡𝐶𝑜𝑙𝑜𝑟 in the test class */
	public String getColorName() {
        if(color == Color.BLACK) { return "black"; }
        if(color ==  Color.BLUE) { return "blue"; }  
        if(color == Color.GREEN) { return "green"; } 
        if(color == Color.RED) { return "red"; } 
        if(color == Color.WHITE) { return "white"; }
        if(color == Color.CYAN) { return "cyan"; }
        if(color == Color.YELLOW) { return "yellow"; }
           
    return null;
	}
}
