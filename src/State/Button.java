package State;

public class Button {

	private State currentState = Off.getInstance();
	
	public void setState(State state) {
		currentState = state;
	}
	
	public void press() {
		State newState = currentState.press();
		currentState = newState;
	}
}
