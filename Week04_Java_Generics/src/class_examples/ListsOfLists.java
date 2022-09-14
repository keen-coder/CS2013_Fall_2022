package class_examples;

import java.util.ArrayList;

public class ListsOfLists {
	public static void main(String[] args) {
		ArrayList<Integer> subList1 = new ArrayList<>();
		ArrayList<Integer> subList2 = new ArrayList<>();
		ArrayList<Integer> subList3 = new ArrayList<>();
		
		subList1.add(1);
		subList1.add(2);
		subList1.add(3);
		
		subList2.add(10);
		subList2.add(20);
		subList2.add(30);
		
		subList3.add(100);
		subList3.add(200);
		subList3.add(300);
		
		
		ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
		
		mainList.add(subList1); //1, 2, 3
		mainList.add(subList2); //10, 20, 30
		mainList.add(subList3); //100, 200, 300
		
		System.out.println(mainList.get(1).get(2));
		
		printLists(mainList);
		
	}
	
	public static <E> void printLists(ArrayList<ArrayList<E>> list) {
		
		for (int i = 0 ; i < list.size() ; i++) {
			for (int j = 0 ; j < list.get(i).size() ; j++) {
				System.out.print(list.get(i).get(j) + " ");
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
