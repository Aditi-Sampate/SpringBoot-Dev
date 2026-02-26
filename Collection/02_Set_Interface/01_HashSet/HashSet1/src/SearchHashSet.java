import java.util.HashSet;

public class SearchHashSet {

	public static void main(String[] args) {
		
	 HashSet<String> names = new HashSet<>();
		
		names.add("Riya");
		names.add("Siya");
		names.add("Kiya");
		
		String searchName = "Siya";
		
		if(names.contains(searchName))
		{
			System.out.println(searchName + " is Present.");
		}
		
		else
		{
			System.out.println(searchName + " is not Present ");
		}
	}
}
