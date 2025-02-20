import java.util.HashMap;

public class HashMapCrud {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		// Adding values
		map.put("Apple", 1);
		map.put("Banana", 2);
		map.put("Cherry", 3);
		System.out.println("Initial HashMap: " + map);
		
		// Getting values
		Integer appleValue = map.get("Apple");
		System.out.println("Value associated with Apple: " + appleValue);
		
		// Updating values
		map.put("Apple", 10);
		
		// Update the value for "Apple"
		System.out.println("Updated HashMap: " + map);
		
		// Removing values
		map.remove("Banana");
		System.out.println("HashMap after removing Banana: " + map);

	}

}
