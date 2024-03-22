package FlyWeight;

public class ConcreteFlyweight implements Flyweight{
    private  int intrinsicState;

    public ConcreteFlyweight(int intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(int extrinscState) {
        System.out.println("intrinsicState = " + intrinsicState);
        System.out.println("extrinscState = " + extrinscState);
    }
}
