
public class Singleton {
	private Singleton() {

	}

	private static Singleton s = null;

	// Lazy way of creating Singleton object
	public static Singleton getInstance() {
		// Object of this class
		if (s == null) {// Before entering the synchronized block, it checks if the instance is already created to avoid unnecessary synchronization.
			synchronized (Singleton.class) {// Ensures that only one thread can enter this block at a time.
				if (s == null) {// Ensures that no other thread has created the instance while the current thread was waiting to enter the synchronized block.
					s = new Singleton();
				}
			}

		}
		return s;
	}

	public static void main(String args[]) {
		Singleton s1 = s.getInstance();
		Singleton s2 = s.getInstance();
		System.out.println(s1 == s2);

		Singleton s3 = s.getInstance();
		System.out.println(s3.hashCode());

		Singleton s4 = s.getInstance();
		System.out.println(s4.hashCode());

	}
}
