import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		
		// Create HashSet
        HashSet<String> cities = new HashSet<>();

        // Add elements
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Chennai");

        // Add duplicate (ignored)
        cities.add("Pune");

        // Add null value
        cities.add(null);

        System.out.println("HashSet: " + cities);

        // Convert HashSet to array
        Object[] arr = cities.toArray();

        System.out.println("Using regular for loop:");
        
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
	}
}
