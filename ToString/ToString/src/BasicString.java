/*
 * toString() method is present inside the object class.
 * If you want to print the state of object then we can override that into the child class.
 * 
 */

import java.util.HashSet;
import java.util.Set;

public class BasicString {

	public static void main(String[] args) {

		Student s1 = new Student(1, "sakshi");
		Student s2 = new Student(2, "Shreya");
		Student s3 = new Student(3, "Gatha");
		
		Set<Student> set = new HashSet<>();
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		System.out.println(set);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
	}

}

class Student
{
	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Student id=" + id + ", name=" + name + "";
	}
	
}
