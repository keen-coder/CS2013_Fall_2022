package class_examples;

public class DynamicList2<E> {
	private int size;
	private E[] data;

	public DynamicList2() {
		this.data = (E[])(new Object[10]);
	}
	
	private void resizeGood() {
		E[] temp = (E[])(new Object[this.data.length * 2]);
		System.arraycopy(this.data, 0, temp, 0, this.data.length);
		this.data = temp;
	}
	
	private void resizeBad() {
		E[] temp = (E[])(new Object[this.data.length + 100]);
		System.arraycopy(this.data, 0, temp, 0, this.data.length);
		this.data = temp;
	}
		
	public void addGood(E value) {
		if (this.size == this.data.length) {
			this.resizeGood();
		}
		
		this.data[this.size] = value;
		this.size++;
	}
	
	public void addBad(E value) {
		if (this.size == this.data.length) {
			this.resizeBad();
		}
		
		this.data[this.size] = value;
		this.size++;
	}

	
}
