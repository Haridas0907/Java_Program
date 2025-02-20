class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}
public class Voting {
	
	static void validate(int age)throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Age is not valid Vote");
		}else {
			System.out.println("Welcome To Vote:");
		}
	
	}

	public static void main(String[] args) {
		try {
			validate(5);
		}catch(Exception ex) {
			System.out.println("Caught the exception");
			System.out.println("exception occuered :"+ ex);
		}
		System.out.println("Rest Of the code");

	}

}
