import java.util.stream.IntStream;

public class OddNumber1000Withsum {
    public static void main(String[] args) {

        // Using IntStream to generate odd numbers, limit to 1000, and calculate the sum
        /*int sum = IntStream.range(1, 2001)  // Generates numbers from 1 to 2000
                .filter(n -> n % 2 != 0)   // Filter to keep only odd numbers
                .limit(1000)                // Limit the stream to the first 1000 odd numbers
                .peek(System.out::println)  // Print each odd number as it's processed
                .sum(); */                    // Calculate the sum of these 1000 odd numbers

        // Print the sum of the first 1000 odd numbers
       // System.out.println("Odd numbers 1 to 1000 and their sum: " + sum);
        
        int sum=IntStream.range(1, 1000).filter(s->s%2!=0)
        		.limit(1000)
        		.peek(System.out::println)
        		.sum();
        System.out.println(sum);
    }
}
