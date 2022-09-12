package m_w_section;

import m_w_section.Shape;

public class Rectangle extends Shape{
	
	
	private double width, height;

	
	public Rectangle(String color, boolean isFilled,
			double width, double height) {
		super(color, isFilled);
		this.width = width; 
		this.height = height;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
