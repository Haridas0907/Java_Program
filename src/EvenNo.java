
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(12);
		list.add(18);
		list.add(29);

		/*
		 * List<Integer>EvenList=new ArrayList<>(); for(Integer i:list) { if(i%2==0) {
		 * EvenList.add(i);
		 * 
		 * } } System.out.print(EvenList);
		 */
		List<Integer> li = list.stream().filter(i -> i > 8).map(i -> i * i*i).collect(Collectors.toList());
		System.out.print(li);
	}

}