import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        String prefix = "fruit_";
        String suffix="_Sweet";

        List<String> prefixedWords = words.stream()
                .map(word -> prefix + word+suffix)
                .collect(Collectors.toList());

        System.out.println("Original words: " + words);
        System.out.println("Prefixed words: " + prefixedWords);
    }
}
