package Bridge;

public abstract class ShapeAbstraction {
	protected DrawImplementor implentation;

	protected ShapeAbstraction(DrawImplementor implentation) {
		super();
		this.implentation = implentation;
	}
	
	public abstract void draw();
}
