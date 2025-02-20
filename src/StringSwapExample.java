
public class StringSwapExample {
	public static void main(String[] args) {
		String str1 = "Haridas";
		String str2 = "Chavan";

		System.out.println("Before swapping:");
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);

		// Swapping the strings without a third variable
		
				
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());

		System.out.println("\nAfter swapping:");
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
	}
}
