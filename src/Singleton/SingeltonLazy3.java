package Singleton;

// 懒汉式 双重检查锁
// 其实本来第一次改进的锁也可以这样加，但是会造成一个问题就是两个都进行非空判断以后，交替拿锁还是创建了多个实例
public class SingeltonLazy3 {
    private static  volatile  SingeltonLazy3 instance;

    private  SingeltonLazy3(){}

    public static  SingeltonLazy3 getInstance(){
        if(instance == null){
            synchronized (SingeltonLazy3.class){
                if(instance == null){
                    instance = new SingeltonLazy3();
                }
            }
        }
        return instance;
    }
}
