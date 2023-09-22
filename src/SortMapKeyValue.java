import java.util.HashMap;
import java.util.Map;

//Sorting Key and Value using Map

public class SortMapKeyValue {

	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Mangal");
		map.put(2, "Hari");
		map.put(3, "Chetan");
		map.put(4, "Vikas");

		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).map(Map.Entry::getValue)
				.forEach(System.out::println);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).map(Map.Entry::getKey)
		.forEach(System.out::println);
	}
}      
