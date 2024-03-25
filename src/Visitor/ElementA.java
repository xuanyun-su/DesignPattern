package Visitor;

public class ElementA implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
