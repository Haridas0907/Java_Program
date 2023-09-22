public class Test {
	public static void main(String[] args) {
		String s = new String("Sachin");
		String s1 = "Sachin";
		String s2 = new String("Sachin");
		String s4 = s;
		System.out.println(s == s1);
		System.out.println(s == s2);
		System.out.println(s4 == s);
		System.out.println(s1.equals(s4));
	}

}