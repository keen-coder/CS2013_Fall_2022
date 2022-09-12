package t_th_section;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Growable g1 = new Person();
		Growable g2 = new Tree();
		
		ArrayList<Growable> list = new ArrayList<>();
		
		list.add(new Person());
		list.add(new Tree());
		
		//Shape s = new Shape();
		
		s.area();
		
		Test a1 = new Test(10);
		Test a2 = new Test(20);
		Test a3 = new Test(30);
		
		System.out.println(a1.x);
		System.out.println(a2.x);
		
		int x = 2;
		Integer y = x;
		
		ArrayList<Circle> circles = new ArrayList<>();
		
		circles.add(new Circle(6.7));
		
		Collections.sort(circles);
		
		
		
		
	}
	
	public static void myMethod(int[] x) {
		x[0] = 100;
		
	}

}
