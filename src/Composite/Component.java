package Composite;

public abstract class Component {

	protected int value;	
	
	public Component(int value) {
		super();
		this.value = value;
	}
	
	public abstract void add(Component c);
	public abstract void traverse();
	public abstract Component getChild(int position);
}