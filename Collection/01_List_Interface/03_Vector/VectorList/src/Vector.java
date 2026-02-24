
public class Vector {

	public static void main(String[] args) {
		
		java.util.Vector<String> names = new java.util.Vector<>();
	
		
		names.add("Aditi");
		names.add("Prachi");
		names.add("Komal");
		
		System.out.println("Names : "+names);
		
		names.remove("Aditi");
		System.out.println("After Remove :"+names);
		
		System.out.println("Size :"+names.size());
		
	}
}
