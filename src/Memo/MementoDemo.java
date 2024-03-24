package Memo;

public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State 2");
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State 3");
        caretaker.addMemento(originator.saveStateToMemento());

        System.out.println("Current State: " + originator.getState()); // State 3

        originator.getStateFromMemento(caretaker.getMemento(0));
        System.out.println("Restored State: " + originator.getState()); // State 1
    }
}
