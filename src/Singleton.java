
public class Singleton {
	private Singleton() {
	}
	
	private static Singleton s=null;
	public static Singleton getInstance() {
		if(s==null) {
			s=new Singleton();
	}
		return s;
	}
	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.println(s1==s2);

	}

}

