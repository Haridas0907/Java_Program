import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateAndCount {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

		// Step 1: Find the count of duplicates
		Set<String> result = new HashSet<>();
		long duplicateCount = names.stream().filter(s -> !result.add(s)).count();
		System.out.println("Number of duplicate elements: " + duplicateCount);

		// Step 2: Find the duplicates with their counts
		Map<String, Long> countMap = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Group by element and
																							// count occurrences
				.entrySet().stream().filter(entry -> entry.getValue() > 1) // Filter only duplicates
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		// Print duplicate elements and their counts
		countMap.forEach((key, value) -> {
			System.out.println(key + ": " + value);
		});
	}

}