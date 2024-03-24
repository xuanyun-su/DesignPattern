package State;

public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context();
        context.request();  // 输出 "当前状态是 A."

        context.setState(new ConcreteStateB());
        context.request();  // 输出 "当前状态是 B."
    }
}
