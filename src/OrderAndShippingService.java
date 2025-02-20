
interface Shopping {
	public String Order();

}

class Flipkart implements Shopping {

	@Override
	public String Order() {

		return "Order from Flipkart";
	}

}

class Amazon implements Shopping {

	@Override
	public String Order() {

		return "Ordering from Amazon";
	}

}

public class OrderAndShippingService {
	@Autowired
	@Qualifired("Flipkart")
	
	private Shopping shopping;
	
	public void DisplayOrderAndShoppingService() {
		System.out.println(shopping.DisplayOrderAndShoppingService);
	}

}
