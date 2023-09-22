import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee12 {
    private String name;
    private double salary;
    private String department;
    private int age;

    public Employee12(String name, double salary, String department, int age) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee12 [name=" + name + ", salary=" + salary + ", department=" + department + ", age=" + age + "]";
    }
}

public class EmployeeFilter {
    public static void main(String[] args) {
        List<Employee12> employees = new ArrayList<>();
        employees.add(new Employee12("Alice", 6000, "IT", 30));
        employees.add(new Employee12("Bob", 4500, "HR", 12));
        employees.add(new Employee12("Alex", 5500, "IT", 25));
        employees.add(new Employee12("Adam", 5100, "IT", 20));
        employees.add(new Employee12("Eve", 7000, "IT", 26));

        // Use Java 8 Stream to filter employees and increase salary
        List<Employee12> filteredEmployees = employees.stream()
                .filter(e -> e.getSalary() > 5000)
                .filter(e -> e.getName().startsWith("A"))
                .filter(e -> e.getDepartment().equals("IT"))
                //.filter(e -> (e.getAge() > 25 || e.getAge() == 25)) // Include employees aged 25 and above
                .peek(e -> {
                    if (e.getAge() > 25) {
                        e.setSalary(e.getSalary() * 0.75); // Increase salary by 0.10% for employees aged >25
                    }
                })
                .collect(Collectors.toList());

        // Print the filtered employees
        System.out.println("Employees with salary > 5000, name starting with 'A', in the IT department, and age >= 25:");
        filteredEmployees.forEach(System.out::println);
    }
}
