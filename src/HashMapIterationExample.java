import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapIterationExample {
	public static void main(String[] args) {
        
    Map<String,Integer>map=new HashMap<>();
    map.put("Vedansh", 27);
    map.put("Haridas", 26);
    map.put("Mangal", 9);
    map.put("Vikas", 4);
    
    map.forEach((key,value)->System.out.println("Key :" +key+ "Value :" + value));
    
List<String>topKey=map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue(Comparator.reverseOrder())).limit(1).map(Map.Entry::getKey).collect(Collectors.toList());    
    
    System.out.println(topKey);
    }
}
