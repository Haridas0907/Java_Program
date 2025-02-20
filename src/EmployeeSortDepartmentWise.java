
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee13 {
	private String name;
	private String department;

	public Employee13(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}
}

public class EmployeeSortDepartmentWise {
	public static void main(String[] args) {
		List<Employee13> employees = new ArrayList<>();
		employees.add(new Employee13("John Doe", "Sales"));
		employees.add(new Employee13("Jane Doe", "Marketing"));
		employees.add(new Employee13("Bob Smith", "Sales"));
		employees.add(new Employee13("Alice Johnson", "Marketing"));

		Map<String, Long> departmentCount = employees.stream()
				.collect(Collectors.groupingBy(Employee13::getDepartment, Collectors.counting()));

		departmentCount.forEach((department, count) -> System.out.println(department + ": " + count));
	}}

	

	