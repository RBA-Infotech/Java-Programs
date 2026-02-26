package DesignPatternBehavioral.ObserverDesignPattern;

//Subject Interface
public interface Subject {

	void attach(Observer observer);

	void detach(Observer observer);

	void notifyObservers();
}
