import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//java-program-to-count-occurrences-of-each-character
//Java Program to Count the Occurrences of Each Character

public class FindCountCharacter {
	public static void main(String args[]) {
		String str = "Java Is Awesome";
		Map<String, Long> result = Arrays.stream(str.replace(" ", "").split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

		System.out.println(result);
	}
}
