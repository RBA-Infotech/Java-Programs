package OOPs;

import java.util.Scanner;

class ShopDetails{
	private String productName;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}	
}

public class DEDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShopDetails shopDetails = new ShopDetails();
		
		System.out.println("Enter the Product Name");
		Scanner sc = new Scanner(System.in);
		String productName = sc.nextLine();
		
		shopDetails.setProductName(productName);
		
		System.out.println("The product name you entered is = " + shopDetails.getProductName());
	}
}
