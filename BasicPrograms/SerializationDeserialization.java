package JavaIO;

import java.io.*;

class Person implements Serializable {
	private static final long serialVersionUID = 1L; // Recommended practice
	private String name;
	private int age;
	private transient String password; // Will not be serialized

	public Person(String name, int age, String password) {
		this.name = name;
		this.age = age;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + ", password='" + password + "'}";
	}
}

public class SerializationDeserialization {

	public static void main(String[] args) {
		String filename = "./src/JavaIO/person.ser"; // File to store serialized object

		// Serialization
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			Person person = new Person("John Doe", 30, "securePassword123");
			oos.writeObject(person);
			System.out.println("Object serialized successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialization
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			Person deserializedPerson = (Person) ois.readObject();
			System.out.println("Object deserialized: " + deserializedPerson);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
