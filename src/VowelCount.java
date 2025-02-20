import java.security.Identity;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class VowelCount {

	public static void main(String[] args) {

		String str = "haridas is a java developer";
		List<Character> vowels = Arrays.asList('a', 'i', 'e', 'u', 'o');

		Map<Character,Long>vowelCount=str.chars().mapToObj(c->(char)c).filter(vowels::contains).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		vowelCount.forEach((vowel,count)->{
			System.out.println("Vowel :" +vowel+ " " +count);
		});
	}
}