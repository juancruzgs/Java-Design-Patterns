package Facade;

public class OrderFacade {

	Payment payment = new Payment();
	Inventory inventory = new Inventory();
	
	public void placeOrder(String orderId) {
		System.out.println(String.format(
				"Steps completed: %1$s , %2$s", 
				inventory.checkInventory(orderId), 
				payment.deductPayment(orderId)
				));
	}
}
