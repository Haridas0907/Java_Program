import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseOrder {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);

		List<Integer> list = s.collect(Collectors.toList());
		Collections.reverse(list);
		System.out.println(list);
	}

}
