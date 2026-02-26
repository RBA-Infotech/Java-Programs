package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

class OrderDetails {
	private int orderId;
	private List<String> itemNames;
	private boolean cashOnDelivery;

	public OrderDetails(int orderId, List<String> itemNames, boolean cashOnDelivery) {
		this.orderId = orderId;
		this.itemNames = itemNames;
		this.cashOnDelivery = cashOnDelivery;
	}
	// Constructors Getters and Setters

	public List<String> getItemNames() {
		return itemNames;
	}

	public void setItemNames(List<String> itemNames) {
		this.itemNames = itemNames;
	}

}

public class RetrieveListOfItems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<OrderDetails> orderList = new ArrayList<OrderDetails>();

		List<String> items1 = new ArrayList<String>();
		items1.add("FriedRice");
		items1.add("Pasta");
		items1.add("Thorthilla");
		orderList.add(new OrderDetails(101, items1, true));

		List<String> items2 = new ArrayList<String>();
		items2.add("Pizza");
		items2.add("Pasta");
		orderList.add(new OrderDetails(101, items2, true));

		List<String> items3 = new ArrayList<String>();
		items3.add("Burger");
		items3.add("Sandwich");
		items3.add("Pizza");
		orderList.add(new OrderDetails(101, items3, true));

		List<String> orderedItemNames = new ArrayList<String>();

		// Code here

		for (OrderDetails obj : orderList) {
			orderedItemNames.addAll(obj.getItemNames());
		}

		for (String obj : orderedItemNames) {
			System.out.println(obj);
		}

	}
}
