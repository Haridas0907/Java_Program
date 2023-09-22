public class StringReverseExample {

	public static void main(String[] args) {

		String name = "Haridas";
		String rev = new StringBuffer(name).reverse().toString();
		System.out.println("String after reverse:" + rev);

	}

} 