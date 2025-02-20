import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "BAT";
		String str2 = "TAB";

		if (isAnagram(str1, str2)) {
			System.out.println(str1 + " And " + str2 + " Are Anagram");
		} else {
			System.out.println(str1 + " And " + str2 + " Are Not Anagram");
		}
	}

	public static boolean isAnagram(String str1, String str2) {
		// TODO Auto-generated method stub
		return Arrays.equals(str1.toLowerCase().chars().sorted().toArray(),
				str2.toLowerCase().chars().sorted().toArray());
	}

}
