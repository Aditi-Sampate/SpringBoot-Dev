import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {

        // Create LinkedHashSet
        LinkedHashSet<String> colors = new LinkedHashSet<>();

        // Add elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        // Add duplicate (ignored)
        colors.add("Blue");

        // Add null value
        colors.add(null);

        System.out.println("LinkedHashSet: " + colors);

        // Remove element
        colors.remove("Green");
        System.out.println("After remove: " + colors);

        // Size
        System.out.println("Size: " + colors.size());

        // Using regular for loop (convert to array)
        Object[] arr = colors.toArray();

        System.out.println("Using regular for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
