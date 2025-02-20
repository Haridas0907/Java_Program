import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//String [] testSTring={"ABC", "DEF", "12", "43","40", "79","GHI", "ABC123"};

public class Alphanumeric {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("ABC", "DEF", "12", "43", "40", "79", "GHI", "ABC123");
		list.stream().filter(s->s.matches("\\d+")).forEach(System.out::println);
		list.stream().filter(s->s.matches(".*[a-zA-Z]")).forEach(System.out::println);

		
	}
}
