import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<>();
		
		//Add Elements
		fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        
        System.out.println("LinkedList :"+fruits);
        
        //Add Element at First And Last
        fruits.addFirst("Grapes");
        fruits.addLast("Pineapple");
        
        System.out.println("After AddFirst and AddLast :"+fruits);
        
        //Get Elements
        System.out.println("First Element :" +fruits.getFirst());
        System.out.println("Last Element :"+fruits.getLast());
        
        //Remove Element
        fruits.remove("Mango");
        System.out.println("After Remove :"+fruits);
        
        //Size
        System.out.println("Size :"+fruits.size());
        
        //Loop Using For-each
        System.out.println("Using for-each loop :");
        for(String fruit :fruits)
        {
        	System.out.println(fruit);
        }
        
	}
}
