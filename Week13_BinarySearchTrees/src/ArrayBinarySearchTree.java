
public class ArrayBinarySearchTree<E extends Comparable<E>> {
	private E[] data;
	private int size;
	
	public ArrayBinarySearchTree() {
		this.data = (E[])(new Object[100]);
		for (int i = 0 ; i< this.data.length ; i++) {
			this.data[i] = null;
		}
		
	}
	
	public void insert(E data) {
		
		if (this.data[0] == null) {
			this.data[0] = data;
		}
		else {
			int currentIndex = 0;
			
			while(this.data[currentIndex] != null) {
				//Go left:
				if (data.compareTo(this.data[currentIndex]) < 0) {
					currentIndex = (2 * currentIndex) + 1;
				}
				else if (data.compareTo(this.data[currentIndex]) == 0){ 
					throw new IllegalArgumentException();
				}
				else {
					currentIndex = (2 * currentIndex) + 2;
				}
			}
			
			this.data[currentIndex] = data;
			this.size++;
		}
		
		
		
		
		
	}
	
}
