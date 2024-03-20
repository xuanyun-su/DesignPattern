package Factory.AbstractFactory;

public class NvidiaGPU implements GPU{
    @Override
    public String getType() {
        return "Nvidia GPU";
    }
}
