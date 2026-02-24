import java.util.Vector;

public class VectorListEx {

	 public static void main(String[] args) {

	        // Create Vector
	        Vector<Integer> numbers = new Vector<>();

	        // Add elements
	        numbers.add(10);
	        numbers.add(25);
	        numbers.add(40);
	        numbers.add(15);

	        System.out.println("Vector: " + numbers);

	        // Add element at specific index
	        numbers.add(2, 50);
	        System.out.println("After adding at index 2: " + numbers);

	        // Get element
	        System.out.println("Element at index 1: " + numbers.get(1));

	        // Remove element
	        numbers.remove(Integer.valueOf(25));
	        System.out.println("After remove: " + numbers);

	        // Size
	        System.out.println("Size: " + numbers.size());

	        // Check if contains element
	        System.out.println("Contains 40? " + numbers.contains(40));

	        // Loop using for-each
	        System.out.println("Using for-each loop:");
	        for (Integer num : numbers) 
	        {
	            System.out.println(num);
	            
	        }
	        
	 }
	 
}
