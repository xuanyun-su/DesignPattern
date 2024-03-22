package FlyWeight;
// 非享元对象
public class Context {
    private Flyweight flyweight;
    private int extrinsicState;

    public Context(int extrinsicState,Flyweight flyweight) {
        this.flyweight = flyweight;
        this.extrinsicState = extrinsicState;
    }

    public  void operation(){
        flyweight.operation(extrinsicState);
    }
}
