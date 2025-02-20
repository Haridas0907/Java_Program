
/*1.Reflection API to break Singleton Pattern
 * Solution Save for Reflection API 1.if is there==>throw exception inside constructor
 *  2.Use Enum
 * 
 */
import java.lang.reflect.Constructor;

public class SingletonBreak {

	private SingletonBreak() {
		
		
		/*
		 * if(s!=null) { throw new
		 * RuntimeException("You are trying to break singleton pattern"); }
		 */
	}

	private static SingletonBreak s = null;

	public static SingletonBreak getInstance() {
		if (s == null) {
			synchronized (SingletonBreak.class) {
				if (s == null) {
					s = new SingletonBreak();
					
				}

			}
		}
		return s;

	}

	public static void main(String[] args) throws Exception {
		/**
		 * SingltoneBreak s1=s.getInstance(); System.out.println(s1.hashCode());
		 * SingltoneBreak s2=s.getInstance(); System.out.hhprintln(s2.hashCode());
		 **/

		SingletonBreak s1 = s.getInstance();
		System.out.println(s1.hashCode());

		Constructor<SingletonBreak> constructor = SingletonBreak.class.getDeclaredConstructor();
		SingletonBreak s2 = constructor.newInstance();
		constructor.setAccessible(true);
		System.out.println(s2.hashCode());

	}
}

/*
 * import java.lang.reflect.Constructor;
 * 
 * public enum SingletonBreak { INSTANCE;
 * 
 * 
 * private SingletonBreak() {
 * 
 * if(s!=null) { throw new
 * RuntimeException("You are trying to break singleton pattern"); }
 * 
 * }
 * 
 * private static SingletonBreak s=null; public static SingletonBreak
 * getInstance() { if(s==null) { synchronized (SingletonBreak.class) {
 * if(s==null) { s=new SingletonBreak(); }
 * 
 * } } return s;
 * 
 * }
 * 
 * 
 * public static void main(String[] args) throws Exception {
 *//**
	 * SingltoneBreak s1=s.getInstance(); System.out.println(s1.hashCode());
	 * SingltoneBreak s2=s.getInstance(); System.out.println(s2.hashCode());
	 **//*
		 * 
		 * SingletonBreak s1 = SingletonBreak.INSTANCE;
		 * 
		 * System.out.println(s1.hashCode());
		 * 
		 * Constructor<SingletonBreak> constructor =
		 * SingletonBreak.class.getDeclaredConstructor(); SingletonBreak s2 =
		 * constructor.newInstance(); constructor.setAccessible(true);
		 * System.out.println(s2.hashCode());
		 * 
		 * } }
		 */