import java.util.ArrayList;

public class ArrayListEx {

public static void main(String[] args) {
	
	ArrayList<String> names = new ArrayList<>();
	
	names.add("Aditi");
	names.add("Atharv");
	names.add("Shreya");
	names.add("Shravani");
	names.add("Gatha");
	
	//Display List
	System.out.println("ArrayList :"+names);
	
	//Update Element
	names.set(2, "Ishu");
	System.out.println("After Update:"+names);
	
	//Remove Element
	names.remove("Shravani");
	System.out.println("Size :" +names);
	
	//Size of List
	System.out.println("Size :"+names.size());
	
	//Loop Through ArrayList
	System.out.println("Using For Loop :");
	for(int i=0; i<names.size(); i++)
	{
		System.out.println(names.get(i));
	}
	
  }

}
