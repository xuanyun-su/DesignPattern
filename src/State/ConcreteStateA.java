package State;

public class ConcreteStateA implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("当前状态A");
    }
}
