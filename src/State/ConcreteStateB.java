package State;

public class ConcreteStateB implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("当前状态是B");
    }
}
