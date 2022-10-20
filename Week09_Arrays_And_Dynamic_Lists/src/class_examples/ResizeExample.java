package class_examples;

import java.util.ArrayList;

public class ResizeExample {

	public static void main(String[] args) {
		int N = 7;
		int SIZE = 100000;
		
		long start = System.currentTimeMillis();
		repeat(N, SIZE);
		long end = System.currentTimeMillis();
		
		System.out.println("Time: " + (end - start) + "ms");

	}
	
	public static void repeat(int n, int size) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 1 ; i <= size ; i++) {
			list.add(n);
			list.trimToSize();
		}
	}
	

}
