import java.util.stream.Stream;

public class HelloWorld5000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hello World";
		Stream.generate(()->"Hello World").limit(5000).forEach(System.out::println);
		System.out.println(str.repeat(5000));
		

	}

}
