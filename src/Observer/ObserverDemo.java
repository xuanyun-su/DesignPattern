package Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver("Observer1");
        Observer observer2 = new ConcreteObserver("Observer2");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.notifyObservers("Hello, observers!");

        subject.removeObserver(observer2);

        subject.notifyObservers("Goodbye, observers!");
    }
}