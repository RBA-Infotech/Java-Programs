package DemoExamples;

class Shop{
	
	int noOfProducts;
	
	void displayProducts(int noOfProducts) {
		this.noOfProducts=noOfProducts;	
		System.out.println("No of Products in Shop: " + noOfProducts);
	}
	
}


public class ThisKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shop shop = new Shop();
		int noOfProducts = 100;
		shop.displayProducts(noOfProducts);
		
	}

}
