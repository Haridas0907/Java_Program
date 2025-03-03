import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMapWithLength {

	public static void main(String[] args) {
    List<String>list=Arrays.asList("Java","Python","SpringBoot","Hibernate");
    
    Map<String,Integer>map=new HashMap<>();
    list.forEach(str->map.put(str, str.length()));
    System.out.println(map);
    
    
		
	}

}
