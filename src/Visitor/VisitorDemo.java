package Visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        ElementA elementA = new ElementA();
        ElementB elementB = new ElementB();

        ConcreteVisitor visitor = new ConcreteVisitor();
        elementA.accept(visitor);  // 输出 "Visiting element A"
        elementB.accept(visitor);  // 输出 "Visiting element B"
    }
}
