import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseInteger {

	public static void main(String[] args) {
		// Initialize the list of Double values
		List<Double> list = Arrays.asList(10.12, 23.56, 45.67, 78.89);

		/*
		 * // Reverse the digits of each number List<String> reversedList =
		 * list.stream() .map(d -> new StringBuilder(d.toString()).reverse().toString())
		 * // Reverse each number as a string .collect(Collectors.toList());
		 * 
		 * // Print the reversed numbers System.out.println(reversedList);
		 */

		list.stream().map(s -> new StringBuilder(s.toString()).reverse().toString()).forEach(System.out::println);
	}
}