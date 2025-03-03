import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Haridas";
		str = str.toLowerCase();

		Map<String, Long> result = Arrays.stream(str.replace("", "").split(""))
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

		result.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

	}

}
