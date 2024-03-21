package Adapter;

// 被适配者 需要被适配的类和对象，他已经存在但不满足客户需要要进行转化
public class Adaptee {
    public void specificRequest(){
        System.out.println("Specific request is being processed");
    }
}
