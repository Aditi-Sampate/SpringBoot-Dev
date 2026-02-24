import java.util.Vector;

public class UpdateVector {

	public static void main(String[] args) {
		
		Vector<Integer> marks = new Vector<>();
		
		marks.add(70);
		marks.add(80);
		marks.add(90);
		
		System.out.println("Before Update :"+marks);
		
		marks.set(1, 85);	//Update index 1
		
		System.out.println("After Update :"+marks);
		
	}
}
