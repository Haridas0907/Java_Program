import java.util.Arrays;
import java.util.stream.Collectors;

public class EachWordFirstCharCapital {

	public static void main(String[] args) {

		String str = "this is a java programmer";
		String result=Arrays.stream(str.split(" "))
				.map(s->s.substring(0,1).toLowerCase()+s.substring(1)).collect(Collectors.joining(" "));
		System.out.println(result);
	}
}