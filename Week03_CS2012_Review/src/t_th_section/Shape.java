package t_th_section;

public abstract class Shape {
	protected String color;
	protected boolean isFilled;
	
	public Shape(String color, boolean isFilled) {
		this.color = color;
		this.isFilled = isFilled;
	}
	//Shape
	public abstract double area();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	
}
