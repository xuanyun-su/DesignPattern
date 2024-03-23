package Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        String[] names = {"John","Michael","Bob","Tommy"};
        Container<String> nameContainer = new Container<String>(names);
        Iterator<String> iterator = nameContainer.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
