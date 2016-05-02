package Adapter;

public class LineAdapter implements ShapeAdapter {

	Line adaptee = new Line();
 	
	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		adaptee.draw(x1, y1, x2, y2);
	}

}
