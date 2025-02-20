import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxNumber {

	public static void main(String[] args) {
      
		
		List<Integer>numbers=Arrays.asList(111,23,456,899,999);
		Integer maxNubmer=numbers.stream().max(Integer::compare).orElseThrow();
		System.out.println(maxNubmer);
	}

}
