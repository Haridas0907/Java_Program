import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find second highest occurrence character from the String eg....String str = "aabbbcccc";
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		
		/*
*/
		
		List<String>list=Arrays.asList("Haridas","Vikas","Rahul");
		Map<Character, Long>result=list.stream().flatMap(s->s.chars().mapToObj(c->(char)c)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
result.forEach((key,value)->{
	System.out.println("Key :"+ key + "Value: "+ value);
});
	}

}
