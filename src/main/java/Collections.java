import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		
		Set<String> fruits = new HashSet<>();  //unordered collection with no duplicates
		fruits.add("apple");
		fruits.add("Mango");
		fruits.add("Dragon fruit");
		fruits.add("Mango");
		//fruits.remove("apple");
		System.out.println(fruits);
	
		List<String> tools= new ArrayList<>();// Ordered with duplicates allowed
		tools.add("selenium");
		tools.add("selenium");
		tools.add("TestNG");
		tools.add("Maven");
		System.out.println(tools.get(0));
		System.out.println(tools);
		
	
	
	
	
	}

}
