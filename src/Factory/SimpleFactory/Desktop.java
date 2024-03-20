package Factory.SimpleFactory;

public class Desktop implements Computer{
    @Override
    public String getType() {
        return "Desktop Computer";
    }
}
