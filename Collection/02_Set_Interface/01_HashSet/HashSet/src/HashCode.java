import java.util.HashSet;

public class HashCode {

	public static void main(String[] args) {
		
		HashSet<Integer> numbers = new HashSet<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);//Does not allow duplicate values
		numbers.add(null);
		numbers.add(null); //only allow one null value
							//Insertion order is not maintained in Hashset.
		
		System.out.println("HashSet Elements :"+numbers);
	}
}
