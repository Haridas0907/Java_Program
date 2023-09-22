//list of numbers Integer value find start with 1 numbers
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterIntegersStartingWith1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(123, 456, 101, 789, 102, 198);

        List<Integer> numbersStartingWith1 = numbers.stream()
            .filter(n -> String.valueOf(n).startsWith("1"))
            .collect(Collectors.toList());

        System.out.println("Numbers starting with 1: " + numbersStartingWith1);
    }
}
