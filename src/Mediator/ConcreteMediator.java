package Mediator;

public class ConcreteMediator implements Mediator{
    private Colleague colleague1;
    private Colleague colleague2;

    public void setColleague1(Colleague colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Colleague colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void sendMessage(Colleague colleague, String message) {
        if(colleague == colleague1) {
            colleague2.receiveMessage(message);
        }else{
            colleague1.receiveMessage(message);
        }
    }
}
