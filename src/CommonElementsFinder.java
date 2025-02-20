import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementsFinder {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Vedansh", "Vedansh", "Haridas", "Mangal");
		Set<String>result=new HashSet<>();
		list.stream().filter(s->!result.add(s)).collect(Collectors.toSet()).forEach(System.out::println);
		int[] arr = {1, 2, 4, 3, 9, 7, 2, 3};

        // Convert int[] to Integer list
        List<Integer> lists = Arrays.stream(arr)            // Convert int[] to IntStream
                                   .boxed()                // Convert each int to Integer
                                   .collect(Collectors.toList());

        // Find duplicates using a Set and filter
        Set<Integer> results = new HashSet<>();
        
        lists.stream()
            .filter(s -> !results.add(s))    // If add() returns false, the element is a duplicate
            .collect(Collectors.toSet())    // Collect duplicates into a Set
            .forEach(System.out::println); 

	}

}
