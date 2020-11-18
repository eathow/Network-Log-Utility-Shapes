import java.util.Iterator;
import java.util.TreeSet;


/** Extends 𝑗𝑎𝑣𝑎. 𝑢𝑡𝑖𝑙. 𝑇𝑟𝑒𝑒𝑆𝑒𝑡 */
public class ShapeList extends TreeSet<Shape> {

	public ShapeList() {
	}
	
	/** 𝑎𝑑𝑑: checks if a similar 𝑆h𝑎𝑝𝑒 instance is already stored. If a similar object is found, the method returns false. If
	it is not, the object is added and the method returns 𝑡𝑟𝑢𝑒. YOU MUST USE the 𝑐𝑜𝑛𝑡𝑎𝑖𝑛𝑠􏰀 􏰁 method from 𝑇𝑟𝑒𝑒𝑆𝑒𝑡 which requires that the 
	method 𝑐𝑜𝑚𝑝𝑎𝑟𝑒𝑇𝑜􏰀 􏰁 is be overloaded properly. Do not write your own search code */
	public boolean add(Shape instance) {
		if(instance instanceof Shape) {
		if(contains(instance)) {
			return false;
		}
		else {
			super.add(instance);
			return true;
		}
		}
		else {
			return false;
		}
	}
	
	/** 𝑔𝑒𝑡2𝐷𝑆h𝑎𝑝𝑒𝑠: returns a new set containing instances of supertype 𝑆h𝑎𝑝𝑒2𝐷 ONLY 
	 * Hint: the 𝑖𝑛𝑠𝑡𝑎𝑐𝑒𝑜𝑓 operator is useful here */
	public ShapeList get2DShapes() {
		ShapeList shape = new ShapeList();
		Iterator<Shape> iterator = iterator();
		while(iterator.hasNext()) {
			Shape s = iterator.next();
			if((s instanceof Shape2D) && !(s instanceof Shape3D)) {
				shape.add(s);
			}
		}
		return shape;
	}
	
	/** 𝑔𝑒𝑡3𝐷𝑆h𝑎𝑝𝑒𝑠: returns a new set containing instances of supertype 𝑆h𝑎𝑝𝑒3𝐷 ONLY */
	public ShapeList get3DShapes() {
		ShapeList shape = new ShapeList();
		Iterator<Shape> iterator = iterator();
		while(iterator.hasNext()) {
			Shape s = iterator.next();
			if(s instanceof Shape3D) {
				shape.add(s);
			}
		}
		return shape;
	}
	
	public int getSize() {
		int i = 0;
		ShapeList shape = new ShapeList();
		Iterator<Shape> iterator = iterator();
		while(iterator.hasNext()) {
			iterator.next();
			i++;
		}
		return i;
	}
	
	/** 𝑝𝑟𝑖𝑛𝑡𝐹𝑜𝑟𝑚𝑎𝑡𝑡𝑒𝑑: prints a sorted and formatted table of all 𝑆h𝑎𝑝𝑒 objects (Figure 2). 
	 * The list is automatically sorted by 𝑁𝑎𝑚𝑒, then 𝐶𝑜𝑙𝑜𝑟, then 𝐷𝑖𝑚𝑒𝑛𝑠𝑖𝑜𝑛 based on the 
	 * 𝑐𝑜𝑚𝑝𝑎𝑟𝑒𝑇𝑜􏰀 􏰁 implementation described earlier */
	public void printFormatted() {
		String dimensions = "";
		Shape s;
		System.out.println("+--------+-------------+---------+--------------------------+----------------------+");
		Iterator<Shape> iterator = iterator();
		while(iterator.hasNext()) {
			s = iterator.next();
			if(s instanceof Quadrilateral3D) {
				dimensions = ((Quadrilateral3D) s).getDimensions();
			}
			else {
				dimensions = ((Quadrilateral) s).getDimensions();
			}
			System.out.printf("|");
			System.out.printf(" %-7s", s.id);
			System.out.printf("|");
			System.out.printf(" %-12s", s.name);
			System.out.printf("|");
			System.out.printf(" %-8s", s.getColorName());
			System.out.printf("|");
			System.out.printf(" %-25s", dimensions);
			System.out.printf("|");
			System.out.printf(" %-21s", s.description);
			System.out.printf("|%n");
			System.out.println("+--------+-------------+---------+--------------------------+----------------------+");
			}
}
}

