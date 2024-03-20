package Factory.SimpleFactory;

public class Laptop implements Computer{
    @Override
    public String getType() {
        return "Laptop Computer";
    }
}
