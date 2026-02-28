import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		
		TreeSet<String> names = new TreeSet<>();
		
		names.add("Aditi");
		names.add("Prachi");
		names.add("Komal");
		names.add("Shraddha");
		names.add("Gatha");
		
		//names.add(null); //NullPointerException
		
		System.out.println(names);
		
	}
}
