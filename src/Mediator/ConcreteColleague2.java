package Mediator;

public class ConcreteColleague2 extends Colleague{
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Colleague2 received: " + message);
    }
}
