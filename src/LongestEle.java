import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Find Longest Element

public class LongestEle {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Pineapple", "Mango", "Orange");
		String Max = fruits.stream().max(Comparator.comparing(String::length)).get();
		System.out.println(Max);

	}
}
