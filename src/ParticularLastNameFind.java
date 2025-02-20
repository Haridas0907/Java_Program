import java.util.Arrays;
import java.util.List;

import java.util.Arrays;
import java.util.List;

class PraticularLastNameFind {
	public static void main(String[] args) {

		List<String> result = Arrays.asList("Vikas Kale", "Haridas Chavan", "Vedansh Chavan");
		result.stream().map(names -> names.split(" ")[1]).filter(LastName -> LastName.equals("kale")).findFirst()
				.ifPresent(System.out::println);
	}
}