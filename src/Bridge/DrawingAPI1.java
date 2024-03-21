package Bridge;

public class DrawingAPI1 implements DrawingAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing a circle with radius " + radius + " at (" + x + "," + y + ") using API1.");
    }
}
