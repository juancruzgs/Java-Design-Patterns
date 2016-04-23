package Prototype;

public class LCD extends TV {

	public LCD(String name) {
		super(name);
	}

	@Override
	public TV cloneObject() {
		return new LCD("Clone: " + name);
	}
}
