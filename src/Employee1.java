import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee1 implements Comparable<Employee1> {
	String name;
	int age;
	int salary;

	public Employee1(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee1 employee1) {
		return this.age - employee1.age;
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		/*
		 * Employee1[]allemp=new Employee1[3]; allemp[0]=new
		 * Employee1("Sachin",45,25000); allemp[1]=new Employee1("Dhoni",40,35000);
		 * allemp[2]=new Employee1("kohli",34,30000);
		 * 
		 * 
		 * Arrays.sort(allemp); for(int i=0;i<allemp.length;i++) {
		 * System.out.println(allemp[i]+" "); }
		 */

		List<Employee1> emplist = new ArrayList<>();
		emplist.add(new Employee1("Sachin", 45, 25000));
		emplist.add(new Employee1("Dhoni", 40, 35000));
		emplist.add(new Employee1("kohli", 34, 30000));
		Collections.sort(emplist);// Using Comparable
		System.out.println(emplist);

		Collections.sort(emplist, new AgeComparator());// Using Coparator
		System.out.println(emplist);

		Collections.sort(emplist, new SalaryComparator());// Using Coparator
		System.out.println(emplist);

	}

}

class AgeComparator implements Comparator<Employee1> {
	public int compare(Employee1 emp1, Employee1 emp2) {
		return emp1.getAge() - emp2.getAge();
	}

}

class SalaryComparator implements Comparator<Employee1> {
	public int compare(Employee1 emp1, Employee1 emp2) {
		return emp1.getSalary() - emp2.getSalary();

	}
}