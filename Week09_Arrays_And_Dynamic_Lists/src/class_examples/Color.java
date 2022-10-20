package class_examples;

public class Color implements Comparable<Color> {
	private String color;
	
	public Color(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return this.color;
	}
	
	@Override
	public int compareTo(Color o) {
		return this.color.compareTo(o.color);
	}
}
