package OOPs;

/*
 *  *********** Variable Types *****************
 *  Local Variable
 *  Instance Variable
 *  Static Variable
 * 
 */
class ShopDetails{
	int itemNo = 1;
	String itemName = "Rice";
	static int totalQuantity = 10; 
	
	void displayProduct() {
		float price = 456.21f;
		System.out.println("Item No: "+ itemNo + "\tItem Name: " + itemName + "\tPrice: " + price);
	}
	
	 static void displayQuantity() {
		System.out.println("The Quantity is : " + totalQuantity);
	}
}

public class VariableTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShopDetails shopDetails = new ShopDetails();
		shopDetails.displayProduct();
		
		System.out.println("Statil Variable Demo: Quantity : " + ShopDetails.totalQuantity);
		ShopDetails.displayQuantity();
		
	}

}
