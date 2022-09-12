package m_w_section;
import java.util.Scanner;


public class Circle extends Shape implements Comparable<Circle>{
	private double radius;
	
	//default, no-arg 
	public Circle() {
		super();
		this.radius = 1;
	}
	
	public Circle(String color, boolean isFilled, 
			double radius) {
		super(color, isFilled);
		this.setRadius(radius);
	}
	
	public double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		if(radius < 1) {
			System.out.println("ERROR: Radius cannot be negative.");
		}
		else {
			this.radius = radius;
		}
	}
	
	public String toString() {
		String result = "";
		
		result += "radius:\t" + this.radius + "\n";
		result += "color:\t" + this.color;
		
		return result;
		
	}

	@Override
	public int compareTo(Circle o) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
}
 