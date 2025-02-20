
public class ImmutableStr {
	public static void main(String[] args) {
		String str =new String("Java");
		String str1= new String("Java");
		 String str2=str1;
		str.toUpperCase();
		System.out.println(str);
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		System.out.println(str2.equals(str1));

	}

}
