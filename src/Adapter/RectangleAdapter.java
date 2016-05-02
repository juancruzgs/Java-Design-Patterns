package Adapter;

public class RectangleAdapter implements ShapeAdapter {

	Rectangle adaptee = new Rectangle();
	
	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		adaptee.draw(Math.min(x1, x2), Math.max(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
	}

}
