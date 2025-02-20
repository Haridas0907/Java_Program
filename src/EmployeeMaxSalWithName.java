

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeMaxSalWithName {
    public static void main(String[] args) {
        List<Employee009> employees = List.of(
                new Employee009("Emp1", 21, 100000),
                new Employee009("Emp2", 25, 8000),
                new Employee009("Emp3", 19, 450000),
                new Employee009("Emp4", 17, 50000),
                new Employee009("Emp5", 18, 680000),
                new Employee009("Emp6", 15, 54000),
                new Employee009("Emp7", 20, 780000),
                new Employee009("Emp8", 23, 465000),
                new Employee009("Emp9", 25, 1236450),
                new Employee009("Emp10", 26, 1200000),
                new Employee009("Emp11", 28, 1200000),
                new Employee009("Emp12", 12, 789450),
                new Employee009("Emp13", 12, 789999)
        );

        // Finding the employee with the highest salary
        Optional<Employee009> highestSalEmployee = employees.stream()
                .max(Comparator.comparingInt(Employee009::getSal));  // Comparator to compare by salary

        // Check if the Optional has a value and print the result
        highestSalEmployee.ifPresent(employee -> {
            System.out.println("Employee with highest salary: " + employee.getName() + ": " + employee.getSal());
        });
    }
}
 class Employee009 {
	private String name;
	private int age;
	private int sal;

	// Constructor
	public Employee009(String name, int age, int sal) {
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

