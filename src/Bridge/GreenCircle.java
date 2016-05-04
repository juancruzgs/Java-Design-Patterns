package Bridge;

public class GreenCircle implements DrawImplementor {

	@Override
	public void draw(int radius, int x, int y) {
		System.out.println(String.format("Draw GreenCircle. Radius: %1$s, x: %2$s, y: %3$s", radius, x, y));
	}

	
}
