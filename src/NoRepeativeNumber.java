import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoRepeativeNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 23, 56, 56);

		list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

	}

}
