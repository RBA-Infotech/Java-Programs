package Java8Features;


public interface I {

	void display();
	
	default void show1() {
		System.out.println("Default method 1");
	}
	
	
	default void show2() {
		System.out.println("Default method 2");
	}
}
