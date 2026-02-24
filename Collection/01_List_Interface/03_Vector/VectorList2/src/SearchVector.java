import java.util.Vector;

public class SearchVector {

	public static void main(String[] args) {
		
		Vector<String> cities = new Vector<>();
		
		 cities.add("Pune");
		 cities.add("Mumbai");
	     cities.add("Nashik");
	     cities.add("Nagpur");
	     
	     String searchCity = "Mumbai";
	     
	     if(cities.contains(searchCity))
	     {
	    	 System.out.println(searchCity+ " is present in the Vector.");
	     }
	     else
	     {
	    	 System.out.println(searchCity+ " is not present.");
	     }
	     
	}
}
