import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ParagraphWordCount {

	public static void main(String[] args) {
		String str = "The Dog was barking on stranger. The Dog sceam sceared";

		str=str.replaceAll("^[a-zA-Z]\\s", "").toLowerCase();
		Map<String,Long>result=Arrays.stream(str.split("\\s+")).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()));
		System.out.println(result);
	}
}
