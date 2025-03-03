import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateOddNumber {

	public static void main(String[] args) {

		List<Integer>number=Arrays.asList(2,5,7,9,10,6,8,3);
		
		Predicate<Integer>isOdd=x->x%2!=0;
		
		
		System.out.println(isOdd.test(15));
		
		List<Integer>oddNumber=number.stream().filter(isOdd).collect(Collectors.toList());
		
		System.out.println("Odd Number :" + oddNumber);
		}

}
