package FlyWeight;

public class FlyweightDemo {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight1 = factory.getFlyweight(100);
        Flyweight flyweight2 = factory.getFlyweight(200);
        Flyweight flyweight3 = factory.getFlyweight(100);

        Context context1 = new Context(10, flyweight1);
        Context context2 = new Context(20, flyweight2);
        Context context3 = new Context(30, flyweight3);

        context1.operation();
        context2.operation();
        context3.operation();
    }
}
