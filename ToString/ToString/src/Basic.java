/*toString() is a method of the Object class, 
 * and by default it prints the class name followed by @ and the hash code,
 *  which is not readable.We override toString() to display 
 *  object data in a meaningful and human-readable form.*/

public class Basic {

	public static void main(String[] args) 
	{
		
		Teacher t1 = new Teacher(1,"aditi");
			
		//Teacher@24d46ca6-it print when we not override the toString method in child class
		
		System.out.println(t1);	//Teacher@24d46ca6
		System.out.println(t1.toString());	//Teacher [id=1, name=aditi]
		
		//and when we override this method then it gives output--->Student [id=1, name= Siya ]
	}
	
}

class Teacher
{
	private int id;
	private String name;
	
	//Constructor
	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//Override the toString() method
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
	
}