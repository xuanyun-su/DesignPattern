//package other.DynamicProxy.CGLibProxy;
//
//public class CglibProxyExample {
//    public static void main(String[] args) {
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(Target.class);
//        enhancer.setCallback(new ProxyInterceptor(new Target()));
//        Target proxy = (Target) enhancer.create();
//        proxy.method();
//    }
//}