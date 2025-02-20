import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindCountCharacter {
	public static void main(String[] args) {
		String str = "Vedansh Haridas Chavhan";
		str = str.toLowerCase();

		Map<String, Long> result = Arrays.stream(str.replace(" ", "").split(""))
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
		System.out.println(result);

	}
}
