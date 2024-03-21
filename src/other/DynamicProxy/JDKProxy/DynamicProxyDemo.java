package other.DynamicProxy.JDKProxy;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {
    public static void main(String[] args) {
        Target target = new TargetImpl();
        ProxyHandler handler = new ProxyHandler(target);
        // 创建代理对象
        Target proxy = (Target) Proxy.newProxyInstance(
                Target.class.getClassLoader(),
                new Class[]{Target.class}, // target.getClass().getInterface()
                handler
        );
        // 这个东西可以写构造方法里面
        //调用代理对象方法
        proxy.method();

    }
}
