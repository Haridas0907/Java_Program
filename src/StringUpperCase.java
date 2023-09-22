import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUpperCase {

	public static void main(String[] args) {

//		String[] s = { "Java", "AdvanceJava", "Restapi", "Webservice", "Aws" };
//		List<String> s1 = Arrays.asList(s);
//		List<String> update = s1.stream()./* filter(x->x.charAt(0)=='e'). */map(x -> x.toUpperCase())
//				.collect(Collectors.toList());
//		// List<String>update=s1.stream().filter(x->x.startsWith("A")).collect(Collectors.toList());
//
//		System.out.println(update);
//	}
		String[] s = { "Java", "Python", "CSS" };
		List<String> s2 = Arrays.asList(s);
		List<String> update = s2.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(update);

	}
}