package class_examples;

public class DynamicList<E> {
	private int size;
	private E[] data;
	
	
	private void resize() {
		E[] temp = (E[])(new Object[this.data.length * 2]);
		System.arraycopy(this.data, 0, temp, 0, this.data.length);
		this.data = temp;
	}
	
	public void add(E item) {
		if (this.size == this.data.length) {
			resize();
		}
		
		
		
		
	}
	
	
	
	
}
