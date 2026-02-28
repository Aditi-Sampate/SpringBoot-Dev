import java.util.TreeSet;

public class TreeSetExample {


	public static void main(String[] args) {
		
		//Create TreeSet
		TreeSet<Integer> marks = new TreeSet<>();
		
		//Add Element
		marks.add(75);
		marks.add(90);
		marks.add(60);
		marks.add(85);
		marks.add(70);
		
		//Duplicate (ignored)
		marks.add(90);
		
		System.out.println("TreeSet (Sorted Marks): "+marks);
		
		//Check Element
		System.out.println("Contains 85 :" +marks.contains(85));
		
		//Ceiling and Floor
		 System.out.println("Ceiling of 72: " + marks.ceiling(72));
	        System.out.println("Floor of 72: " + marks.floor(72));

	        // Subset (range between 70 and 90)
	        System.out.println("Marks between 70 and 90: " + marks.subSet(70, 90));

	        // Remove last element
	        marks.pollLast();
	        System.out.println("After removing highest mark: " + marks);

	        // Size
	        System.out.println("Size: " + marks.size());

	        // Regular for loop
	        Object[] arr = marks.toArray();
	        System.out.println("Using regular for loop:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.println(arr[i]);
	        }
		
	}
}
