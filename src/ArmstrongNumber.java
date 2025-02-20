
public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=1634;
		int sum=0;
		int temp=n;
		
		while(n>0) {
			sum+=Math.pow(n%10, 4);
			n/=10;
			
		}
		if(temp==sum) {
			System.out.println("Given Number is Armstrong Number: " +sum);
		}else {
			System.out.println("Given Nummber is not Armstrong Number : " +sum);
		}
	}

}