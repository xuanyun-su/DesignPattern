package Singleton;

// 懒汉式 线程不安全 多线程进来的时候都进行了非空判断，创建了多个实例对象
public class SingletonLazy {
    private  static SingletonLazy instance;
    private SingletonLazy(){}
    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }

}
