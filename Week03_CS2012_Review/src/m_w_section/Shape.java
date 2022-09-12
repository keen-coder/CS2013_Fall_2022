package m_w_section;

public abstract class Shape {
	protected String color;
	private boolean isFilled;

	public Shape() {
		this.color = "red";
		this.isFilled = false;
	}
	
	public Shape(String color, boolean isFilled) {
		this.color = color;
		this.isFilled = isFilled;
	}
	
	public final String getColor() {
		return this.color;
	}
	
	public abstract double area();
	
	
	
	
	
	
	
	
	
	
	
	
}
