package Factory.AbstractFactory;

public class AMDCPU implements CPU{
    @Override
    public String getType() {
        return "AMD CPU";
    }
}
