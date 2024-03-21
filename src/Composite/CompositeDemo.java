package Composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Composite root = new Composite();
        Composite branch1 = new Composite();
        Composite branch2 = new Composite();

        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");
        Leaf leaf3 = new Leaf("Leaf 3");
        Leaf leaf4 = new Leaf("Leaf 4");

        root.addChild(branch1);
        root.addChild(branch2);

        branch1.addChild(leaf1);
        branch1.addChild(leaf2);

        branch2.addChild(leaf3);
        branch2.addChild(leaf4);

        root.operation();
    }
}
