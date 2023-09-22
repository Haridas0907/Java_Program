
//Find Unique Customer ID
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Customer {
	int CustId;
	String CName;
	long CSalary;

	public Customer(int CustId, String CName, long CSalary) {
		this.CustId = CustId;
		this.CName = CName;
		this.CSalary = CSalary;
	}

	public int getCustId() {
		return CustId;
	}

	// Other getter and setter methods
	@Override
	public int hashCode() {
		return Objects.hash(CustId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return CustId == other.CustId;
	}

	@Override
	public String toString() {
		return "Customer [CustId=" + CustId + ", CName=" + CName + ", CSalary=" + CSalary + "]";
	}

}

public class Demo1 {
	public static void main(String[] args) {
		List<Customer> cust = new ArrayList<>();

		cust.add(new Customer(100, "John", 20000));
		cust.add(new Customer(101, "Ram", 25000));
		cust.add(new Customer(101, "Shyam", 25000));

		System.out.println("Original List:");
		System.out.println(cust);

		List<Customer> result = cust.stream().distinct().collect(Collectors.toList());

		System.out.println("List with Unique Customers:");
		System.out.println(result);
	}
}
