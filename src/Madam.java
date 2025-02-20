import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Madam {

	public static void main(String[] args) {

		String  str="madam";
		List<String>result=Arrays.asList(str.split(""));
		result.stream().filter(s->str.indexOf(s)==str.lastIndexOf(s)).collect(Collectors.toList()).forEach(System.out::println);
		}
}
