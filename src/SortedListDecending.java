import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;

public class SortedListDecending {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2, 5, 15, 80, 56);

		// 1)using Stream
		List<Integer> reversed = number.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversed);

		/**
		 * 2)using List.sort() number.sort(Comparator.reverseOrder());
		 * System.out.println(number);
		 **/

		// 3)using Collections.sort()
//		Collections.sort(number, Comparator.reverseOrder());
//		System.out.println(number);

	}

}
