import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person>{
	@Override
	public int compare(Person p1, Person p2) {
		return p1.getName().compareToIgnoreCase(p2.getName());
		
//		if (p1.getName().equalsIgnoreCase(p2.getName())) {
//			return 0;
//		}
//		else if (p1.getName().compareTo(p2.getName()) < 0 ) {
//			return -1;
//		}
//		else {
//			return 1;
//		}
	}

	

}
