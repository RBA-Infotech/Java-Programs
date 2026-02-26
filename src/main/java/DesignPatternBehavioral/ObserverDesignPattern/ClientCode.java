package DesignPatternBehavioral.ObserverDesignPattern;

// Client Code
public class ClientCode {
	public static void main(String[] args) {
		WeatherStation station = new WeatherStation();

		TemperatureDisplay display = new TemperatureDisplay();
		 Log log = new Log();

		station.attach(display);
		station.attach(log);

		station.setTemperature(25); // Output: Temperature Display: 25°C, Logging: Temperature changed to 25°C
		station.setTemperature(27); // Output: Temperature Display: 27°C, Logging: Temperature changed to 27°C
		
		station.detach(display); // Detach the display i.e disable the notification to observers
		station.detach(log);
		
		station.setTemperature(30); // Output: Logging: Temperature changed to 30°C

		station.attach(display);
		station.attach(log);

		station.setTemperature(56);
	}
}