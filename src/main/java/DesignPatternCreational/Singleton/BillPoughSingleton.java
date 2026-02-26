package DesignPatternCreational.Singleton;

class BPSingleton {
	private BPSingleton() {
	}

	private static class SingletonHelper {
		private static final BPSingleton INSTANCE = new BPSingleton();
	}

	public static BPSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	public  void displayBPSingleton() {
		System.out.println("Bill pough object is created");
	}
}

public class BillPoughSingleton {

	public static void main(String[] args) {

		BPSingleton.getInstance().displayBPSingleton();
	}

}
