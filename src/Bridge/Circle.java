package Bridge;

// 扩充抽象层
public class Circle extends  Shape{
    private  int x,y,radius;

    public Circle(DrawingAPI drawingAPI, int x, int y, int radius) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(radius,x,y);
    }
}
