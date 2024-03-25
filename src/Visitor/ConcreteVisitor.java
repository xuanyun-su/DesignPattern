package Visitor;

public class ConcreteVisitor implements Visitor{
    @Override
    public void visit(ElementA element) {
        System.out.println("Visiting element A");
    }

    @Override
    public void visit(ElementB element) {
        System.out.println("Visisting element B");
    }
}
