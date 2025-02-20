
/**
 * Employee Salary Ascending Order 
 * Employee Salary  Descending Order
 * Employee Find by Name wise
 * Employee Find  by Maximum Salary
 * Employee Find by Minimum Salary
 * Employee Find by Second Highest Salary
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee2 {
	String name;
	String Lastname;
	Long Salary;
	int age;

	public Employee2() {
		super();
	}

	public Employee2(String name, String lastname, long salary, int age) {
		super();
		this.name = name;
		Lastname = lastname;
		Salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public Long getSalary() {
		return Salary;
	}

	public void setSalary(Long salary) {
		Salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", Lastname=" + Lastname + ", Salary=" + Salary + ", age=" + age + "]";
	}

}

public class EmployeeSal {
	public static void main(String[] args) {
		List<Employee2> list = new ArrayList<>();
		list.add(new Employee2("Hari", "Chavan", 52000, 25));
		list.add(new Employee2("Vikas", "Kale", 60000, 25));
		list.add(new Employee2("Chetan", "Udhane", 70000, 25));
		list.add(new Employee2("Santosh", "Pisule", 100000, 26));
		list.add(new Employee2("Afsar", "Shaikh", 90000, 28));
		System.out.println(list);

		// Ascending Order

		List<Employee2> sortedBySal = list.stream().sorted(Comparator.comparingLong(Employee2::getSalary))
				.collect(Collectors.toList());
		System.out.println(sortedBySal);

		// Salary Descending order
		List<Employee2> sortedBySal1 = list.stream().sorted(Comparator.comparingLong(Employee2::getSalary).reversed())
				.collect(Collectors.toList());
		System.out.println(sortedBySal1);

		// Sorted Employee name wise
		List<Employee2> sortedByname = list.stream().sorted(Comparator.comparing(Employee2::getName))
				.collect(Collectors.toList());
		System.out.println(sortedByname);

		// Max Salary
		Optional<Employee2> Max = list.stream()
				.collect(Collectors.maxBy(Comparator.comparingLong(Employee2::getSalary)));
		System.out.println(Max.get());

		// Min Salary
		Optional<Employee2> Min = list.stream()
				.collect(Collectors.minBy(Comparator.comparingLong(Employee2::getSalary)));
		System.out.println(Min.get());
		// Second Highest Salary
		Optional<Employee2> secondhighestsal = list.stream()
				.sorted(Comparator.comparingLong(Employee2::getSalary).reversed()).skip(2).findFirst();
		System.out.println(secondhighestsal.get());

		// Second Minimum Salary
		Optional<Employee2> secondminsal = list.stream().sorted(Comparator.comparingLong(Employee2::getSalary)).skip(1)
				.findFirst();
		System.out.println(secondminsal.get());

		// particular fields
		Optional<Employee2> emp = list.stream().filter(e1 -> e1.name.equalsIgnoreCase("Hari")).findAny();
		if (emp.isPresent())
			System.out.println(emp);
		{

		}
		System.out.println(emp);

		// Employee Salary 20000 greater than long
		long emp1 = list.stream().filter(e -> e.Salary >= 20000).count();

		System.out.println(emp1);

	}

}