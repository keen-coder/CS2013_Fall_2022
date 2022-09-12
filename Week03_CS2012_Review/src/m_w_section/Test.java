package m_w_section;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		Circle c1 = new Circle("Red", true, 2.5);
		Circle c2 = new Circle("green", false, 10.6);
		
		
		
		ArrayList<Circle> circles = new ArrayList<>();
		
		circles.add(c2);
		circles.add(c1);
		
		
		Collections.sort(circles);
		
		
		
//		SomeClass sc = new SomeClass();
//		
//		
//		

//		Rectangle r1 = new Rectangle("blue", true, 4.7, 10.8);
//		
//		printShapeColor(c1);
//		printShapeColor(r1);
		
//		ArrayList<Shape> list = new ArrayList<>();
//		
//		list.add(c1);
//		list.add(r1);
//		
//		for(Shape s : list) {
//			System.out.println(s.area);
//		}
				
//		printArea(c1);
//		
//		ArrayList<Growable> thingsThatGrow = new ArrayList<>();
//		
//		thingsThatGrow.add(new Person());
//		thingsThatGrow.add(new Tree());
		
		

	}
	
	public static void printArea(Shape shape) {
		
		
		if (shape instanceof Circle) {
			Circle temp = (Circle)shape;
			
			temp.getRadius();
		}
	
	}
	

	public static void printShapeColor(Shape shape) {
		System.out.println(shape.getColor());
	}
	
	
	
}
