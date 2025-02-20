import java.util.stream.IntStream;

public class Demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream.rangeClosed(2, 100).filter(n->IntStream.range(2, (int)Math.sqrt(n)+1).noneMatch(i->n%i==0)).forEach(System.out::println);

	}

}
