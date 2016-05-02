package Adapter;

public class Line {

    public void draw(int x1, int y1, int x2, int y2)
    {
        System.out.println(String.format("Line from (%1$s,%2$s) to (%3$s,%4$s)", x1, y1, x2, y2));
    }
}
