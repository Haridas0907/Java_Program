
public class EvenOddNo {

	public static void main(String[] args) {

		int a[] = { 2, 4, 10, 15, 19 };
		System.out.println("Odd Number");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Even number");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}

	}

}