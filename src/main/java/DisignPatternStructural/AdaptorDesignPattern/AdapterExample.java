package DisignPatternStructural.AdaptorDesignPattern;

//Target Interface (Fahrenheit)
interface FahrenheitTemperature {
	double getFahrenheit();
}

//Adaptee (Celsius)
class CelsiusTemperature {
	private double celsius;

	public CelsiusTemperature(double celsius) {
		this.celsius = celsius;
	}

	public double getCelsius() {
		return celsius;
	}
}

//Adapter (Celsius to Fahrenheit)
class CelsiusToFahrenheitAdapter implements FahrenheitTemperature {
	private CelsiusTemperature celsiusTemperature;

	public CelsiusToFahrenheitAdapter(CelsiusTemperature celsiusTemperature) {
		this.celsiusTemperature = celsiusTemperature;
	}

	@Override
	public double getFahrenheit() {
		double celsius = celsiusTemperature.getCelsius();
		return (celsius * 9 / 5) + 32;
	}
}

//Client Code
public class AdapterExample {
	public static void main(String[] args) {
		// instance of Adaptee class
		CelsiusTemperature celsius = new CelsiusTemperature(25); // Adapdee classs
		
		//
		CelsiusToFahrenheitAdapter adapter = new CelsiusToFahrenheitAdapter(celsius);

		FahrenheitTemperature fahrenheit = adapter; // Target Inteface Upcasting

		System.out.println("Celsius: " + celsius.getCelsius());
		System.out.println("Fahrenheit: " + fahrenheit.getFahrenheit());
	}
}
