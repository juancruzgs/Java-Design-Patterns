package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject
 *
 */
public class SensorSystem {

	private List<Observer> observers = new ArrayList<>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	protected void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
