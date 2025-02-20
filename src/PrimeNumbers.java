import java.util.stream.IntStream;

public class PrimeNumbers {
	public static void main(String[] args) {

			//Prime Numbers

		IntStream.rangeClosed(2, 100).filter(n -> IntStream.range(2, (int) Math.sqrt(n) + 1).noneMatch(i -> n % i == 0))
				.forEach(System.out::println);

		
		//Perfect Numbers
		IntStream.range(2, 100).filter(n -> IntStream.range(1, n).filter(i -> n % i == 0).sum() == n)
				.forEach(System.out::println);
	}
}
