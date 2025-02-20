import java.util.Arrays;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayReverseOrder {
	public static void main(String[] args) {
		int[] array = { 121, 25, 450, 64, 78, 1 };
		List<Integer>result=Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(result);
	}
}
