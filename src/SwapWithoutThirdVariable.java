public class SwapWithoutThirdVariable {
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Before swapping value..." + a + " " + b);
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("After Swapping value..." + a + " " + b);

	}

}