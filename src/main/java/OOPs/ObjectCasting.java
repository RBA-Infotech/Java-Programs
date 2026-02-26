package OOPs;

class Animal{
	String name = "Animal Class";
	
	void display() {
		System.out.println(name);
	}
}

class Cat extends Animal{
	
	String name1 = "Cat Class";
	
	void displayCat() {
		System.out.println(name1);
	}
}

class Dog{
	
	String name2 = "Dog Class";
	
	void displayDog(){
	System.out.println(name2);	
	}
}

public class ObjectCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal();
		Cat cat = new Cat();
		
		
		//implicit object casting or upcasting
		animal = cat;
		System.out.println("Upcasting : casting from Subclass to Superclass");
		animal.display();
		
		//downcasting
		cat = (Cat)animal;
		System.out.println("Downcasting: casting from Superclass to Subclass");
		cat.display();
		cat.displayCat();
		
		Dog dog = new Dog();
		
		//casting can be done only if it is superclass or subclass
		animal = (Animal)dog;
					
	}

}
