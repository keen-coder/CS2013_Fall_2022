
package class_examples;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArraysClass {
	public static void main(String[] args) {
		
		int[] arr1 = {3, 1, 5, 6, 8, 4, 6, 8};
		
		//Print array with toString();
		System.out.println("arr1=" + Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		
		System.out.println("sorted arr1=" + Arrays.toString(arr1));
		
		System.out.println(Arrays.binarySearch(arr1, 3));
		System.out.println(Arrays.binarySearch(arr1, 6));
		System.out.println(Arrays.binarySearch(arr1, 7));
		System.out.println(Arrays.binarySearch(arr1, 50));
		
		boolean[] bools = new boolean[20];
		
		System.out.println(Arrays.toString(bools));
		Arrays.fill(bools, true);
		System.out.println(Arrays.toString(bools));
		
		int[] arr2 = {1, 2, 3, 4, 5};
		int[] arr3 = {1, 2, 3, 4, 5};
		int[] arr4 = {1, 2, 7, 4, 5};
		
		System.out.println(Arrays.equals(arr2, arr3));
		System.out.println(Arrays.equals(arr2, arr4));
		
		
		
	}
}

