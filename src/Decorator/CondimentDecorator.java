package Decorator;

// 抽象装饰
public abstract class CondimentDecorator implements  Beverage {
    protected  Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription();
}
