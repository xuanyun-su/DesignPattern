package Iterator;

public class Container<T> {
    private T[] items;

    public Container(T[] items) {
        this.items = items;
    }

    public Iterator<T> createIterator() {
        return new ConcreteIterator<T>(items);
    }
}
