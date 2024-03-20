package Factory.AbstractFactory;

public class IntelCPU implements CPU{
    @Override
    public String getType() {
        return "Intel CPU";
    }
}
