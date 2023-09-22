import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee0 {
	String name;
	int age;
	public Employee0(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	

}

public class Employees {

	public static void main(String[] args) {
		
		List<Employee0>emp=new ArrayList<>();
		emp.add(new Employee0("John",31));
		emp.add(new Employee0("Mary",35));
		emp.add(new Employee0("Rony",32));
		emp.add(new Employee0("Harry",28));
		emp.add(new Employee0("Johnsena",20));
		
	//	long age=emp.stream().filter(e->e.age>=30).count();
		//System.out.print(age);
        
	Optional<Employee0>e1=emp.stream().filter(e->e.name.startsWith("N")).findAny();
		if(e1.isPresent())
	{
		System.out.print(e1);
		}else {
			System.out.println("NOT Found 404");
		}
	}
	//List<Employee>sortedList=emp.stream().sorted((e1,e2)->(e1.age<e2.age)?-1:(e1.age>e2.age)?1:0).collect(Collectors.toList());
 // System.out.println(sortedList);
}