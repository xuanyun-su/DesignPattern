package other.DynamicProxy.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 动态代理
public class ProxyHandler implements InvocationHandler {
    private  Object target;
    public ProxyHandler(Object target){
        this.target = target;
    }

    @Override
    // 这里可以反射 基于各种条件做代理
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before method invocation");
        Object invoke = method.invoke(target, args);
        System.out.println("After method inboke");
        return  invoke;
    }
}
