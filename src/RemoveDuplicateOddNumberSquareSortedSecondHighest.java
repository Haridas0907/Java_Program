import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateOddNumberSquareSortedSecondHighest {

	public static void main(String[] args) {
		
		  List<Integer> numbers = Arrays.asList(5, 3, 7, 9, 11, 13, 5, 17);
		  
		  List<Integer>result=numbers.stream()
				  .distinct()//remove duplicate
		          .filter(n->n%2!=0)//Odd Number
		          .map(n->n*n)//Square Number
		          .sorted((a,b)->b.compareTo(a))//Descending order
		          .skip(1)//Skip Highest Number
		          .findFirst()//Second Highest Number
		          .stream()//Convert stream
		          .collect(Collectors.toList());
		          
		 System.out.println("Second Highest Squared Odd Number: " + result);
		
		
		
		
				
	}
}