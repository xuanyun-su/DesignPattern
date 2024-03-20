package Singleton;

// 静态内部类 静态内部类本身只有第一次被使用才会被加载，实例是延迟加载的
public class SingletonStatic {
    private  SingletonStatic(){
    }
    public  static  class  SingeletonHolder{
        private  static  final  SingletonStatic instance = new SingletonStatic();
    }

    public static  SingletonStatic getInstance(){
        return SingeletonHolder.instance;
    }
}
