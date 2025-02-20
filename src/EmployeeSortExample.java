import java.util.Comparator;
import java.util.List;
//Sort based on salary (highest to lowest), pick top 10 and store it in another list
import java.util.stream.Collectors;

public class EmployeeSortExample {
	public static void main(String[] args) {
		List<Employee11> employees = List.of(new Employee11("Emp1", 21, 10000), new Employee11("Emp2", 25, 8000),
				new Employee11("Emp3", 19, 450000), new Employee11("Emp4", 17, 50000),
				new Employee11("Emp5", 18, 680000), new Employee11("Emp6", 15, 54000),
				new Employee11("Emp7", 20, 780000), new Employee11("Emp8", 23, 465000),
				new Employee11("Emp9", 25, 1236450), new Employee11("Emp10", 26, 1200000),
				new Employee11("Emp11", 28, 1200000), new Employee11("Emp12", 12, 789450),
				new Employee11("Emp13", 12, 789999)

		);

		// Sorting based on salary (highest to lowest) using Java 8 Stream API
		List<Employee11> top10Employees = employees.stream()
				.sorted(Comparator.comparingInt(Employee11::getSal).reversed()).limit(10) // Limit to the top 10
																							// employees
				.collect(Collectors.toList());

		// Print the top 10 employees (for demonstration purposes)
		top10Employees.forEach(e -> System.out.println(e.getName() + ": " + e.getSal()));
		System.out.println(top10Employees);
	}

}

class Employee11 {
	private String name;
	private int age;
	private int sal;

	// Constructor
	public Employee11(String name, int age, int sal) {
		this.name = name;
		this.age = age;
		this.sal = sal;
	}

	// Getters & Setters

	// Getters & Setters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSal() {
		return sal;
	}

	@Override
	public String toString() {
		return "Employee11 [name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
}
