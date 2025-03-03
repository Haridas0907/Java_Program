
//list of numbers Integer value find start with 1 numbers
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterIntegersStartingWith1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(111, 211, 65, 121, 654, 214, 221);
		list.stream().filter(s -> String.valueOf(s).startsWith("1")).forEach(System.out::println);
	}
}