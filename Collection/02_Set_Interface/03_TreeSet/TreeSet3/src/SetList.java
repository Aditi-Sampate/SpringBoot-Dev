import java.util.TreeSet;

public class SetList {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(100);
		set.add(120);
		set.add(50);
		set.add(80);
		set.add(10);
		set.add(66);
		
		
		System.out.println("List: "+ set);
		System.out.println("First Number : " + set.first());
		System.out.println("Last Number: "+ set.last());
		System.out.println("Higher Than 75: " + set.higher(75));
		System.out.println("Lower Than 75: " + set.lower(75));
		
		System.out.println("All Higher Than 75: " + set.tailSet(76));
		System.out.println("All Lower Than 75: " + set.headSet(75));
		
	}
}
