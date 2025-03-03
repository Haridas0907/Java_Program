import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingKeyAndValue {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		// Inserting key-value pairs
		map.put(1, "x");
		map.put(2, "y");
		map.put(2, "z"); // Overwrites the value for key 2 (value will be "z")
		map.put(3, "x");
		map.put(4, "y");
		map.put(5, "z");
		map.put(6, "x");
		map.put(7, "y");

		// Grouping keys by their values using Java 8 Streams
		Map<String,List<Integer>>groupedKeys=map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())));
		
		// Printing the grouped keys
		groupedKeys.forEach((key,value)->{
			System.out.println(key + " " + value + " ");
		});
		
	}
}