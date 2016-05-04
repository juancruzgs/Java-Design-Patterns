package Bridge;

public class RedCircle implements DrawImplementor {

	@Override
	public void draw(int radius, int x, int y) {
		System.out.println(String.format("Draw RedCircle. Radius: %1$s, x: %2$s, y: %3$s", radius, x, y));
	}

}
