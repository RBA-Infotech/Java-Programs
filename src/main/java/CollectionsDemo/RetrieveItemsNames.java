package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

/*******************************
 * 
 * Problem Statement: Now,given a list of orders, retrieve a list of itemNames.
 * 
 * 
 * @author senth
 *
 ***********************************/

class Order {
	private int orderId;
	private String itemName;
	private boolean cashOnDelivery;

	public Order(int orderId, String itemName, boolean cashOnDelivery) {
		this.orderId = orderId;
		this.itemName = itemName;
		this.cashOnDelivery = cashOnDelivery;
	}

	// Getters and Setters
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}

public class RetrieveItemsNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Order> orderedItems = new ArrayList<Order>();
		orderedItems.add(new Order(100, "FriedRice", true));
		orderedItems.add(new Order(120, "Pasta", false));
		orderedItems.add(new Order(105, "Thorthilla", true));
		orderedItems.add(new Order(109, "Pizza", true));

		List<String> orderedItemNames = new ArrayList<String>();
		// Code here

		for (Order obj : orderedItems) {
			orderedItemNames.add(obj.getItemName());
		}
		
		for (String obj : orderedItemNames) {
			System.out.println(obj);
		}
	}

}
