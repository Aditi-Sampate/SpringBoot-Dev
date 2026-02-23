import java.util.LinkedList;

public class MiddleElement {

	public static void main(String[] args) {
		
		LinkedList<Integer> numbers = new LinkedList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(60);
		numbers.add(70);
		
		System.out.println("Numbers :"+numbers);
		
		int middleIndex = numbers.size() / 2;
		
		int middleElement = numbers.get(middleIndex);
		
		System.out.println("Middle Element :"+middleElement);
		
	
	}
}
