import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoRepeativeNumber {

	public static void main(String[] args) {
		Integer arr[]= {1,2,1,3};
		List<Integer>duplicate=Arrays.asList(arr);
		System.out.println(duplicate);
		
		List<Integer>Setduplicate=duplicate.stream().distinct().collect(Collectors.toList());
		System.out.println(Setduplicate);
	}

}
