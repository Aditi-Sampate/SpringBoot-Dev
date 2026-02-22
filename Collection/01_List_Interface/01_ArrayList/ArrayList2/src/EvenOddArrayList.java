import java.util.ArrayList;

public class EvenOddArrayList {

public static void main(String[] args) {

	ArrayList<Integer> numbers = new ArrayList<>();
	
	numbers.add(10);
	numbers.add(15);
	numbers.add(22);
	numbers.add(35);
	numbers.add(40);
	
	System.out.println("Numbers :" +numbers);
	
	int eventCount = 0;
	int oddCount =0;
	
	for(int i=0; i<numbers.size(); i++)
	{
		int num = numbers.get(i);
		
		if(num % 2 ==0)
		{
			eventCount++;
		}
		else
		{
			oddCount++;
		}
	}
	System.out.println("Even Numbers Count :" +eventCount);
	System.out.println("Odd Numbers Count :"+oddCount);
	
 }

}
