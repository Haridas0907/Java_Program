
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindCountInteger {
    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(1, 4, 5, 7, 3, 2, 4);

        Map<Integer, Long> result = numbers.stream()
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

        System.out.println(result);
    }
}