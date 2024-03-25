package Visitor;

public class ElementB implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
