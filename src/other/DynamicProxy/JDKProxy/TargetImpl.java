package other.DynamicProxy.JDKProxy;

public class TargetImpl implements  Target{
    @Override
    public void method() {
        System.out.println("Targeet method inovoke");
    }


}
