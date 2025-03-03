@FunctionalInterface
interface MathOperation {
	int operation(int a, int b);

}

public class CustomFunctionalInterface {

	public static void main(String[] args) {
		MathOperation addition = (a, b) -> a + b;
		System.out.println(addition.operation(10, 5));

	}

}
