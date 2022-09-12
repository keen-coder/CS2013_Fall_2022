package t_th_section;

import java.util.ArrayList;

public class Polymorphism {

	public static void main(String[] args) {
		Shape s1 = new Circle(4.5);
		
		ArrayList<Shape> shapes= new ArrayList<>();
		
		shapes.add(new Circle(8.9));
		shapes.add(new Rectangle("green", true, 5.6, 4.3));
		
		printArea(s1);
		
	}
	public static void printShapes(ArrayList<Shape> shapes) {
		
		//for (int i = 0 ; i < shapes.size() ; i++) {
		//		Shape s = shapes.get(i);
		//}

		for(Shape s : shapes) {
			if (s instanceof Circle) {
				Circle temp = (Circle)s;
				System.out.println(temp.getRadius());
			}
			else if(s instanceof Rectangle) {
				Rectangle temp = (Rectangle)s;
				System.out.println(temp.getWidth());
			}
		}
	}
	
	
	
	//Main
	public static void printArea(Shape shape) {
		System.out.println(shape.area());
		
	}
	
	
	
	
	

}
