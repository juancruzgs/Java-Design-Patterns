package State;

public class Off implements State {

	private static Off instance;
	
	private Off() {
	}
	
	@Override
	public State press() {
		System.out.println("Off Pressed");
		return On.getInstance();
	}
	
	public static Off getInstance() {
		if (instance == null) {
			instance = new Off();
		}
		return instance;
	}

}
