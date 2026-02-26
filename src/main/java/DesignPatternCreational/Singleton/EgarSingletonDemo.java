package DesignPatternCreational.Singleton;

class EagerSingleton {
    // Static instance created at the time of class loading
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    // Private constructor to prevent instantiation
    private EagerSingleton() {
    	
    }

    // Public method to provide access to the instance
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
    
    public void displayEagerSinglton() {
    	System.out.println("Eagar Singleton object is created");
    }
}



public class EgarSingletonDemo {

	public static void main(String[] args) {
		
		//EagerSingleton es = new EagerSingleton();
				
		EagerSingleton.getInstance().displayEagerSinglton();
		
	}

}
