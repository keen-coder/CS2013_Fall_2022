package t_th_section;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		super("green", true);
		this.setRadius(radius);
	}
	
	public Circle(String color, boolean isFilled, 
			double radius) {
		super(color, isFilled);
		this.setRadius(radius);
	}
	//Circle
	@Override
	public double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		if(radius >= 1) {
			this.radius = radius;
		}
		else {
			System.out.println("Radius not changed, value cannot be negative");
		}
	}
	
	@Override
	public String toString() {
		return "";
	}

	
	
	
	
	
	
	
	
	
	
}
