package Bridge;


// 具体实现
public class DrawingAPI2 implements  DrawingAPI{
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing a circle with radius " + radius + " at (" + x + "," + y + ") using API2.");
    }
}
