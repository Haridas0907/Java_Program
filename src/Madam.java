import java.util.Arrays;
import java.util.List;

public class Madam {

	public static void main(String[] args) {
		String str = "madam";
		List<String> list = Arrays.asList(str.split(""));
		String s = list.stream().filter(i -> str.indexOf(i) == str.lastIndexOf(i)).findFirst().orElse("");
		if (s != "") {
			System.out.println("Non Repeating Character:" + s);
		} else {
			System.out.println("NO NON Repeating Character:");
		}

	}

}

