import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordsStratswithVowel {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hari", "Rahul", "Vikas", "Avi", "Ish", "Uma", "Akash", "Vedansh");
		List<String> result = list.stream().filter(s -> s.toLowerCase().matches("^[aeiou].*"))
				.collect(Collectors.toList());
		System.out.println(result);

	}

}
