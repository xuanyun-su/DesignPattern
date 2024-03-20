package Factory.AbstractFactory;

public class AMDGPU implements GPU{
    @Override
    public String getType() {
        return "AMD GPU";
    }
}
