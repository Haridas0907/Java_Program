import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CompleteDuplicateRemove {

	public static void main(String[] args) {
		List<Integer> intList = (Arrays.asList(1, 1, 2, 2, 3, 4, 4, 5, 6, 6, 6, 7, 8, 9, 4, 10));

		intList.stream().filter(s -> Collections.frequency(intList, s) == 1).forEach(System.out::println);
	}
}
