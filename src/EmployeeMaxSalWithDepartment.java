import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeMaxSalWithDepartment {
	public static void main(String[] args) {
		// Sample employee data including department names
		List<Employee15> employees = List.of(new Employee15("Emp1", 21, 100000, "IT"),
				new Employee15("Emp2", 25, 8000, "HR"), new Employee15("Emp3", 19, 450000, "Finance"),
				new Employee15("Emp5", 18, 680000, "Sales"), new Employee15("Emp6", 15, 54000, "HR"),
				new Employee15("Emp7", 20, 780000, "Sales"), new Employee15("Emp8", 23, 465000, "Finance"),
				new Employee15("Emp9", 25, 1236450, "IT"), new Employee15("Emp10", 26, 1200000, "Sales"),
				new Employee15("Emp11", 28, 1200000, "Sales"), new Employee15("Emp12", 12, 789450, "Finance"),
				new Employee15("Emp13", 12, 789999, "Sales"));

		// Finding the employee with the highest salary
		Optional<Employee15>highestSalary=employees.stream().max(Comparator.comparing(Employee15::getSal));
		
		
		highestSalary.ifPresent((employee)->{
			
			System.out.println("Employee Name: "+employee.getName()+"Employee Salary:"+employee.getSal());
			
		});
	}
}

 class Employee15 {
	private String name;
	private int age;
	private int sal;
	private String departmentName; // Added department name field

	public Employee15(String name, int age, int sal, String departmentName) {
		this.name = name;
		this.age = age;
		this.sal = sal;
		this.departmentName = departmentName;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSal() {
		return sal;
	}

	public String getDepartmentName() {
		return departmentName;
	}
}

