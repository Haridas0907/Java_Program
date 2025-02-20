import java.util.Arrays;
import java.util.stream.Collectors;

public class EachWordReverse {

	public static void main(String[] args) {

		String str = "this is a java program";
		String reversed = Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));

		System.out.println(reversed);
	}
}