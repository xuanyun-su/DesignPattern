package Singleton;
// 饿汉式 线程安全，但是占用资源
public class SingletonHungry {
    private static final SingletonHungry instance = new SingletonHungry();

    private SingletonHungry(){}

    public static  SingletonHungry getInstance()
    {
        return instance;
    }
}
