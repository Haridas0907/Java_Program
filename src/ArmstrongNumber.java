
public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 1634;
		int temp = n;
		int sum = 0;

		while (n > 0) {
			sum += Math.pow(n % 10, 4);
			n /= 10;
		}
		if (sum == temp) {
			System.out.println("Given Number is a Armstrong Number :" + sum);
		} else {
			System.out.println("Given Number is Not Armstrong Number :" + sum);
		}
	}

}