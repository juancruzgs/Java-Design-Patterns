package State;

public class On implements State {

	private static On instance;
	
	private On() {
	}
	
	@Override
	public State press() {
		System.out.println("On Pressed");
		return Off.getInstance();
	}
	
	public static On getInstance() {
		if (instance == null) {
			instance = new On();
		}
		return instance;
	}

}
