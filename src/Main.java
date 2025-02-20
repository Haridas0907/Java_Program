import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;

class Employee14 {
	String EmpName;
	String Deparatment;

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getDeparatment() {
		return Deparatment;
	}

	public void setDeparatment(String deparatment) {
		Deparatment = deparatment;
	}

	public Employee14(String empName, String deparatment) {
		super();
		EmpName = empName;
		Deparatment = deparatment;
	}

}

public class Main {

	public static void main(String[] args) {
		List<Employee14> employees = new ArrayList<>();
		employees.add(new Employee14("Vikas", "Software Developer"));
		employees.add(new Employee14("Haridas", "CS"));
		employees.add(new Employee14("Deepali", "Police"));
		employees.add(new Employee14("Rahul", "Software Developer"));

		Map<String, Long> deparmentCounts = employees.stream()
				.collect(Collectors.groupingBy(Employee14::getDeparatment, Collectors.counting()));
deparmentCounts.forEach((department,count)->{
	System.out.println(department+":"+count);
	
});
	}

}
