package Iterator;

public class ConcreteIterator<T> implements  Iterator<T>{
    private T[] items;
    private int position = 0;
    public ConcreteIterator(T[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }

    @Override
    public T next() {
        return items[position++];
    }
}
