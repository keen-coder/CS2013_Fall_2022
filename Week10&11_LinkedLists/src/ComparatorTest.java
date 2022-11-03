import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {

	public static void main(String[] args) {
		Person p1 = new Person("John", 43);
		Person p2 = new Person("Mary", 24);
		Person p3 = new Person("Sam", 21);
		Person p4 = new Person("Alice", 56);
		Person p5 = new Person("Kathy", 27);
		
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		PersonNameComparator nameComp = new PersonNameComparator();
		
		Collections.sort(list, nameComp);
		
		System.out.println(list);
		
		Collections.sort(list, new PersonAgeComparator());
		
		System.out.println(list);
		
		
		
		
		
		
		
		
		
	}
	
	//You can use the Comparator to compare two objects of the same type
	//by calling the compare() method of the comparator.
	//NOTE: The sort() method for the VideoGameLinkedList class won't look
	//exactly like this, but the logic of comparing two VideoGames will be similar.
	public static void mySort(ArrayList<Person> list, 
			Comparator<Person> comparator) {
		Person p1 = list.get(0);
		Person p2 = list.get(1);
		
		if (comparator.compare(p1, p2) == 0) {
			
		}
		else if (comparator.compare(p1, p2) < 0) {
			
		}
		else if (comparator.compare(p1, p2) > 0) {
			
		}
		
	}
	
	
	
	
	
	
	

}
