//package other.DynamicProxy.CGLibProxy;
// 缺包没实现之后处理
//class ProxyInterceptor implements MethodInterceptor {
//    private Object target;
//
//    public ProxyInterceptor(Object target) {
//        this.target = target;
//    }
//
//    @Override
//    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
//        System.out.println("Before method invocation");
//        Object result = proxy.invokeSuper(obj, args);
//        System.out.println("After method invocation");
//        return result;
//    }
//}
