import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TargetNearestElement {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 20, 30, 40);
		Integer target = 32;

		Optional<Integer> nearestElement = myList.stream().sorted(Comparator.comparing(s->Math.abs(s-target))).findFirst();
		
		System.out.println("Nearest Element to " + target + ": " +nearestElement);

	}

}
