package DesignPatternBehavioral.ObserverDesignPattern;

//Concrete Observers (TemperatureDisplay, Log)
class TemperatureDisplay implements Observer {
	@Override
	public void update(Subject subject) {
		WeatherStation station = (WeatherStation) subject; // down casting

		System.out.println("Temperature Display: " + station.getTemperature() + "°C");
	}
}

class Log implements Observer {
	@Override
	public void update(Subject subject) {
		WeatherStation station = (WeatherStation) subject;
		System.out.println("Logging: Temperature changed to " + station.getTemperature() + "°C");
	}
}
