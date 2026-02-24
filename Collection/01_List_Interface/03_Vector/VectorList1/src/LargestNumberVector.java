import java.util.Vector;

public class LargestNumberVector {

	public static void main(String[] args) {
		
		Vector<Integer> numbers = new Vector<>();
		
     	numbers.add(15);
        numbers.add(40);
        numbers.add(25);
        numbers.add(60);
        numbers.add(10);
        
        int max = numbers.get(0);
        
        for(int i=1; i<numbers.size(); i++)
        {
        	if(numbers.get(i) > max)
        	{
        		max = numbers.get(i);
        	}
        }

        System.out.println("Numbers :"+numbers);
        System.out.println("Largest Number :"+max);
        
	}
	
}
