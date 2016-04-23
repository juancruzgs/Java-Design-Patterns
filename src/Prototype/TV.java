package Prototype;

public abstract class TV {

	protected String name;
	
	protected TV(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract TV cloneObject();
}
