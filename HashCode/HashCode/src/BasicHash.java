import java.util.Objects;

public class BasicHash {

	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"komal");
		Employee e2 = new Employee(2, "prachi");
		Employee e3 = new Employee(3, "Aditi");
		Employee e4 = new Employee(4, "Shraddha");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		
	}
	
}


class Employee
{
	private int id;
	private String name;
	

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	/*
	 @Override
	 public int hashCode() {
		return Objects.hash(id, name);
	 }
	*/
}