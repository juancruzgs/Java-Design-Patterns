package Prototype;

public class Plasma extends TV {

	public Plasma(String name) {
		super(name);
	}

	@Override
	public TV cloneObject() {
		return new Plasma("Clone: " + name);
	}
}
