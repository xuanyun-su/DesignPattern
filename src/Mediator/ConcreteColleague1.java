package Mediator;

public class ConcreteColleague1 extends Colleague{
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(this,message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Colleague1 received: "+message);
    }
}
