package BasicPrograms;

import java.util.Scanner;

class ShopInfo{
	
	String productName;
	
	void setProductName(String productName) {
	this.productName = productName;
	}
	
	String getProductName() {
		return productName;
	}
}

public class ThisDemo {

	public static void main(String[] sen) {
		// TODO Auto-generated method stub

		ShopInfo shopInfo = new ShopInfo();
		System.out.println("Enter the product name");
		Scanner sc = new Scanner(System.in);
		String productName = sc.nextLine();
		
		shopInfo.setProductName(productName);
		
		System.out.println("The product you entered is = " + shopInfo.getProductName());
	}

}
