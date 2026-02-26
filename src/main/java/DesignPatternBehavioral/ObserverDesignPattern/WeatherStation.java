package DesignPatternBehavioral.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

//Concrete Subject (WeatherStation)
class WeatherStation implements Subject {
	private List<Observer> observers = new ArrayList<>();
	private int temperature;

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifyObservers(); // Notify observers when temperature changes
	}

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
}
