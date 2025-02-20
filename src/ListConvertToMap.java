import java.util.*;
import java.util.stream.Collectors;

class Customer {
    private int id;
    private String name;
    private String department;

    public Customer(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "'}";
    }
}

public class ListConvertToMap {
    public static void main(String[] args) {
        List<Customer> employees = Arrays.asList(
            new Customer(1, "Alice", "Engineering"),
            new Customer(2, "Bob", "HR"),
            new Customer(3, "Charlie", "Finance")
        );

        // Convert List to Map with employee ID as key
        Map<Integer, Object> employeeMap = employees.stream()
                                                      .collect(Collectors.toMap(Customer::getId, emp -> emp));

        // Print the map
        employeeMap.forEach((id, emp) -> System.out.println("ID: " + id + ", Employee: " + emp));
    }
}
