package Bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape circle1 = new Circle(new  DrawingAPI1(),1,2,3);

        circle1.draw();
        Shape circle2 = new Circle(new  DrawingAPI2(),1,2,3);
        circle2.draw();
    }
}
