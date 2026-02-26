package CollectionsDemo;

	class GenericClass1<T> {
	    private T value;

	    // Constructor
	    public GenericClass1(T value) {
	        this.value = value;
	    }

	    // Getter
	    public T getValue() {
	        return value;
	    }

	    // Setter
//	    public void setValue(T value) {
//	        this.value = value;
//	    }
	}

	public class GenericClass {
	    public static void main(String[] args) {
	        // Integer type
	        GenericClass1<Integer> intObject = new GenericClass1<>(42);
	        System.out.println("Integer Value: " + intObject.getValue());

	        // String type
	        GenericClass1<String> stringObject = new GenericClass1<>("Hello Generics");
	        System.out.println("String Value: " + stringObject.getValue());
		
	        // Float type
	        GenericClass1<Float> floatObject = new GenericClass1<>(2.34f);
	        System.out.println("Float Value: " + floatObject.getValue());
		
	    }

	}
