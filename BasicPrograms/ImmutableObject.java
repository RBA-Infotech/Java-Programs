package Mulithreading;

public final class ImmutableObject { // Make the ImmutableObjectlass final

	private final String name; // Make fields final
	private final int age;

	public ImmutableObject(String name, int age) { // Constructor
		this.name = name;
		this.age = age;
	}

	public String getName() { // Only getter methods
		return name;
	}

	public int getAge() {
		return age;
	}

	// No setter methods

	public ImmutableObject withAge(int newAge) {
		return new ImmutableObject(this.name, newAge);
	}

	public ImmutableObject withName(String newName) {
		return new ImmutableObject(newName, this.age);
	}

	public static void main(String[] args) {
		ImmutableObject obj1 = new ImmutableObject("Alice", 30);
		ImmutableObject obj2 = obj1.withAge(31); // Creates a new object

		System.out.println(obj1.getAge()); // Output: 30
		System.out.println(obj2.getAge()); // Output: 31
	}
}
