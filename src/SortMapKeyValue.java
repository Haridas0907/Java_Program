import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Sorting Key and Value using Map

public class SortMapKeyValue {

	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Haridas", 25);
		map.put("Mangal", 356);
		map.put("Vikas", 210);
		map.put("Vilas", 24);

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).map(Map.Entry::getKey).forEach(System.out::println);

map.entrySet().stream().sorted(Map.Entry.comparingByValue()).map(Map.Entry::getValue).forEach(System.out::println);
		
		 List<String> top3Keys = map.entrySet().stream() .sorted(Map.Entry.<String,
		 Integer>comparingByValue(Comparator.reverseOrder())).limit(1)
		  .map(Map.Entry::getKey).collect(Collectors.toList());
		  
		 // Print the top 3 keys 
		 System.out.println("\n Top 3 keys: " + top3Keys);
		 
		 List<String> top2key = map.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())).limit(2)
				.map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("top 2 keys: " + top2key);
		
		List<String>top4Keys= map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue(Comparator.reverseOrder())).limit(3).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("top4Key"  +top4Keys);
	}
}
