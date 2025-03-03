import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CharchterLess4 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Vedu", "Man", "Vedansh", "Mangal");
		list.stream().filter(s -> s.length() <= 4).forEach(System.out::println);
	}
}
