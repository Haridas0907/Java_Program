import java.util.Arrays;
import java.util.List;

public class VowelPrint {

	public static void main(String[] args) {

		String str = "Haridas is java a developer";
		str = str.toLowerCase();

		List<Character> vowel = Arrays.asList('a', 'e', 'i', 'o', 'u');
		str.chars().mapToObj(c -> (char) c).filter(vowel::contains).forEach(System.out::println);

	}

}
