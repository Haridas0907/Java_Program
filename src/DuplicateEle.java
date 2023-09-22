import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Find Duplicate Element in a Stream

public class DuplicateEle {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("Mangal","Hari","Mangal","Vikas","Hari");
		 Set<String>result=new HashSet<>();
		/** Set<String>result1=list.stream().filter(n->!result.add(n)).collect(Collectors.toSet());
		 * System.out.println(result1);
		**/
	
		list.stream().filter(n->!result.add(n)).collect(Collectors.toSet()).forEach(n->System.out.println(n));

	}

}
