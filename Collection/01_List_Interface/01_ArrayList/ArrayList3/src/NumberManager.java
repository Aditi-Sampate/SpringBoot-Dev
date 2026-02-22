import java.util.ArrayList;
import java.util.Collections;

public class NumberManager {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(12);
		numbers.add(45);
		numbers.add(7);
		numbers.add(30);
		numbers.add(18);
		
		System.out.println("Numbers :"+numbers);
		
		int max = Collections.max(numbers);
		System.out.println("Largest Number :"+max);
		
		int min = Collections.min(numbers);
		System.out.println("Smallest Number :"+min);
		
		int sum = 0;
		
		for(int i=0; i<numbers.size(); i++)
		{
			sum = sum + numbers.get(i);
		}
		
		System.out.println("Sum :"+sum);
		
		double average = sum /(double) numbers.size();
		System.out.println("Average :"+average);

		int search = 30;
		
		if(numbers.contains(search))
		{
			System.out.println(search +"is present in the list.");
		}
		else
		{
			System.out.println(search +"is not present in the list.");
		}
		
		//Remove a Number 
		numbers.remove(Integer.valueOf(7));
		System.out.println("After Removing 7: "+numbers);
		
		//sort the list
		Collections.sort(numbers);
		System.out.println("Sorted List :" +numbers);
		
		//Reverse The List
		Collections.reverse(numbers);
		System.out.println("Reversed List :"+numbers);
		
	}

}
