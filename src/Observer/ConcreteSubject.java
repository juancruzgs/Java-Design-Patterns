package Observer;

public class ConcreteSubject extends SensorSystem {

	private int state; 
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyObservers();
	}
}
