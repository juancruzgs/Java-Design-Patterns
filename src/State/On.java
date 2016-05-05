package State;

public class On implements State {

	private static On instance;
	
	private On() {
	}
	
	@Override
	public void press(Button button) {
		System.out.println("On Pressed");
		button.setState(Off.getInstance());
	}
	
	public static On getInstance() {
		if (instance == null) {
			instance = new On();
		}
		return instance;
	}

}
