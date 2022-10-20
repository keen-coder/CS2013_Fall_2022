package class_examples;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<>();
		
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		
		//iterator()      //forward
		//listiterator(); //bi-directional iterator
		
		Iterator<Integer> iter = myList.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		iter = myList.iterator();
		
		ListIterator lIter = myList.listIterator();
		
		
//		int N = 1000000;
//		
//		long start1 = System.currentTimeMillis();
//		addGoodTest(N);
//		long end1 = System.currentTimeMillis();
//		
//		
//		long start2 = System.currentTimeMillis();
//		addBadTest(N);
//		long end2 = System.currentTimeMillis();
//		
//		System.out.println("Good: " + (end1 - start1));
//		System.out.println("Bad: " + (end2 - start2));

	}
	
	public static void addGoodTest(int n) {
		DynamicList2<Integer> list = new DynamicList2<>();
		
		for(int i = 1 ; i <= n ; i++) {
			list.addGood(7);
		}
		
	}
	
	public static void addBadTest(int n) {
		DynamicList2<Integer> list = new DynamicList2<>();
		
		for(int i = 1 ; i <= n ; i++) {
			list.addBad(7);
		}
		
	}
	
	

}
