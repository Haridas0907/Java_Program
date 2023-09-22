import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainDriver {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		Employee e1 = new Employee("Hari", 26, 25000);
		Employee e2 = new Employee("Vikas", 25, 28000);
		Employee e3 = new Employee("Mahesh", 24, 16000);
		Employee e4 = new Employee("Afsar", 27, 19000);

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);

		System.out.println("Original Salary");
		System.out.println(employees);

		List<Employee> incrementedSalary = employees.stream().map(e -> {
			if (e.getAge() > 25) {
				e.setSalary(e.getSalary() * 1.10);

			}
			return e;
		}).collect(Collectors.toList());
		System.out.println("Incremented Salary");
		System.out.println(incrementedSalary);
	}

}