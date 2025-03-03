import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;



public class LongestElement {

	public static void main(String[] args) {

		
		String str="my names is haridas";
		String result=Arrays.stream(str.split(" ")).//sorted((s1,s2)->s2.length()-s1.length()).findFirst().get();
				max(Comparator.comparing(String::length)).get();
		System.out.println(result);
		
	}

}  
