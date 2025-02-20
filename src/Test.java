interface InterfaceA{
	  default void display() {
		  System.out.println("This is method for InterfaceA");
	  }
}

interface InterfaceB{
	default void display() {
		System.out.println("This is method for InterfaceB");
	}
}

public class Test implements InterfaceA,InterfaceB {
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
	  //System.out.println("This is a Override method");
	  
	  InterfaceA.super.display();
	  
	 
		
	}
	
	public static void main(String[] args) {
		/*
		 * String s = new String("Sachin"); String s1 = "Sachin"; String s2 = new
		 * String("Sachin"); String s4 = s; String s5="Sachin"; System.out.println(s ==
		 * s1); System.out.println(s == s2); System.out.println(s4 == s);
		 * System.out.println(s1.equals(s4)); System.out.println(s1==s5);
		 * 
		 * 
		 */
		
		Test test=new Test();
		test.display();
	
	}

	

}