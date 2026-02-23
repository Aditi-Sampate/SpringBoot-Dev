import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> numbers = new LinkedList<>();
		
		numbers.addFirst(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addFirst(5);
		
		System.out.println("Numbers :" +numbers);
		
		numbers.removeFirst();
		numbers.removeLast();
		
		System.out.println("After Removing First and Last :"+numbers);
	}
}
