import java.util.LinkedList;

public class PositiveNegativeCount {

	public static void main(String[] args) {
		
		LinkedList<Integer> numbers = new LinkedList<>();
		
		numbers.add(10);
		numbers.add(-5);
		numbers.add(20);
		numbers.add(-15);
		numbers.add(30);
		
		int positive = 0;
		int negative = 0;
		
		for(int i=0; i< numbers.size(); i++)
		{
			int num = numbers.get(i);
			
			if(num >= 0)
			{
				positive++;
			}
			else
			{
				negative ++;
			}
		}
		
		System.out.println("Numbers: " + numbers);
		System.out.println("Positive Count: " + positive);
		System.out.println("Negative Count: " + negative);
		
	}
}
