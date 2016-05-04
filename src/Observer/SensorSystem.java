package Observer;

import java.util.ArrayList;
import java.util.List;

public class SensorSystem {

	private List<Observer> observers = new ArrayList<>();
	private int state; 
	
	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyObservers();
	}

}
