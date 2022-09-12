package t_th_section;

public class Rectangle extends Shape{
	
	
	private double width, height;

	
	public Rectangle(String color, boolean isFilled,
			double width, double height) {
		super(color, isFilled);
		this.width = width; 
		this.height = height;
	}

	public double getWidth() {
		return this.width;
	}
	
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
