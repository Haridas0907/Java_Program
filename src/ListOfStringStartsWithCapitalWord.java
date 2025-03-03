import java.util.Arrays;
import java.util.List;

public class ListOfStringStartsWithCapitalWord {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "Hari", "vedansh", "mangal", "Vikas", "gauri", "Dipali");

		list.stream().filter(s -> Character.isUpperCase(s.charAt(0))).forEach(System.out::println);
	}

}
