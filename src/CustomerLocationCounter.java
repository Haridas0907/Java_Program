import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Customer11 {
	private int id;
	private String name;
	private int age;
	private String location;

	public Customer11(int id, String name, int age, String location) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public Integer getAge() {
		return age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}

public class CustomerLocationCounter {
	public static void main(String[] args) {
		List<Customer11> customers = Arrays.asList(new Customer11(1, "Alice", 25, "New York"),
				new Customer11(2, "Bob", 30, "Los Angeles"), new Customer11(3, "Charlie", 28, "New York"),
				new Customer11(4, "David", 35, "Chicago"), new Customer11(5, "Eve", 22, "Chicago"),
				new Customer11(6, "Frank", 30, "Chicago"));

		Map<String, Long> customerLocationCount = customers.stream()
				.collect(Collectors.groupingBy(Customer11::getLocation, Collectors.counting()));
		customerLocationCount.forEach((location,count)->{
			System.out.println("Cutsomer >Location :" + location + " : " +count);
		});

	}

}
