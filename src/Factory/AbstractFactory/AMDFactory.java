package Factory.AbstractFactory;

public class AMDFactory implements ComputerFactory{
    @Override
    public CPU createCPU() {
        return new AMDCPU();
    }

    @Override
    public GPU createGPU() {
        return new AMDGPU();
    }
}
