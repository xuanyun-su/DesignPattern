package State;

public class Context {
    private State state;

    public Context() {
        state = new ConcreteStateA();
    }

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void request(){
        state.doAction(this);
    }
}
