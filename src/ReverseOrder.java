import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseOrder {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(1, 2, 3, 4, 5);

		List<Integer> list = s.collect(Collectors.toList());
		Collections.reverse(list);
		System.out.println(list);
		
		
		String str="Vedansh";
		String rev="";
		char ch;
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
	if(str.equals(rev)) {
		System.out.println("Given string is Palindrome :");
	}else {
		System.out.println("Given String is not Palindrome :");
	}
	
	for(int i=0;i<str.length();i++) {
		ch=str.charAt(i);
		rev=ch+rev;
		
	}
	System.out.println(rev);
	}

}
