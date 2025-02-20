import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArrayListExample {

	public static void main(String[] args) {
		// Creating an ArrayList
		List<String> list = new ArrayList<>();

		List<String>synchronizedlist=Collections.synchronizedList(list);
		synchronizedlist.add("One");
		synchronizedlist.add("Two");
		synchronizedlist.add("Three");
		
		System.out.println(synchronizedlist);

		
	}
}
