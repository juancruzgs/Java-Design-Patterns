package State;

public class Off implements State {

	private static Off instance;
	
	private Off() {
	}
	
	@Override
	public void press(Button button) {
		System.out.println("Off Pressed");
		button.setState(On.getInstance());
	}
	
	public static Off getInstance() {
		if (instance == null) {
			instance = new Off();
		}
		return instance;
	}

}
