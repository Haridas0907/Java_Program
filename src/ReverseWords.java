import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWords {
	public static void main(String[] args) {
		String str = "This is a Pen";
		String reversed = Arrays.stream(str.split(" ")).sorted((a, b) -> -1).collect(Collectors.joining(" "));
		System.out.println(reversed);
		
		
		
		
	}
}
       