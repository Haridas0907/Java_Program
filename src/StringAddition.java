public class StringAddition {
	public static void main(String[] args) {
		// Define two string representations of numbers
	
		String str="111";
		String str2="222";
		
		int num1=Integer.parseInt(str);
		int num2=Integer.parseInt(str2);
		
		int sum=num1+num2;
		
		String result=Integer.toString(sum);
		System.out.println(result);
	}
}
