package Singleton;


// 懒汉式第一次改进 线程安全同步 synchronized锁 但是对于效率大大降低
public class SingeltonLazy2 {
    private  static  SingeltonLazy2 instace;
    private SingeltonLazy2(){}

    public  static synchronized SingeltonLazy2 getInstance(){
        if(instace == null){
            instace = new SingeltonLazy2();
        }
        return instace;
    }
}
