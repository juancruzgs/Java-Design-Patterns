package Adapter;

public class Rectangle {
	
    public void draw(int x, int y, int w, int h)
    {
        System.out.println(String.format("Rectangle at (%1$s,%2$s) width %3$s height %4$s", x, y ,w, h));
    }
}
