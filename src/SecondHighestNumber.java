import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(45, 80, 90, 78, 65);

		// Find the second-highest number
		Optional<Integer> result = list.stream().sorted(Comparator.reverseOrder()) // Sort in descending order
				.skip(1) // Skip the highest number
				.findFirst(); // Get the second number

		Optional<Integer> result1 = list.stream().sorted((a, b) -> b.compareTo(a)).skip(1).findFirst();
		System.out.println(result);
		System.out.println(result1);
		
		Optional<Integer>results=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(results);
		
		Optional<Integer>result2=list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(result2);
		

	}
}
