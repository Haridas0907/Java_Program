/**
 * 
 * @author Hari
 *
 */
public class Employee {
	private String name;
	private int age;
	private double salary;
	private String gender;

	public Employee(String name, int age, double salary) {

		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	/**
	 * 
	 * @return
	 */

	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}

}