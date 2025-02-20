import java.util.Arrays;
import java.util.List;

public class MapFlatMap {

	public static void main(String[] args) {
	
		List<List<String>>list=Arrays.asList(Arrays.asList("Haridas","Nikhil","Mangal"),Arrays.asList("Vikas","Nikita"));
		
		List<List<String>>map=list.stream().map(x->x).toList();
		System.out.println(map);
		
		List<String>flatMap=list.stream().flatMap(x->x.stream()).toList();
		System.out.println(flatMap);

	}

}
