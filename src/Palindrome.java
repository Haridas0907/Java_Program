
public class Palindrome {
	public static void main(String[] args) {

		String str = "madam";
		String rev = "";
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(str.equals(reversed));

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		if (str.equals(rev)) {
			System.out.println("Given String is Palindrome: " + rev);
		} else {
			System.out.println("Given String is a not Palindrome:" + rev);
		}

		boolean isPalindrome = str
				.equals(str.chars().mapToObj(c -> String.valueOf((char) c)).reduce("", (a, b) -> b + a));

		System.out.println("isPalindrome :" + str + " " + isPalindrome);
	}
}