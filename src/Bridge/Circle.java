package Bridge;

public class Circle extends ShapeAbstraction {
	private int radius;
	private int x;
	private int y;
	
	public Circle(DrawImplementor implentation, int radius, int x, int y) {
		super(implentation);
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		implentation.draw(radius, x, y);	
	}
	
}
