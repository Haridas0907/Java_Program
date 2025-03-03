import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Find Longest Element

public class LongestEle {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Pineapple", "Mango", "Orange");
		String max=fruits.stream().max(Comparator.comparing(String::length)).get();
		System.out.println(max);
		
		
		
		
	}
}
