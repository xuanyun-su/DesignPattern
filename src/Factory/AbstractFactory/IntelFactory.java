package Factory.AbstractFactory;

public class IntelFactory implements ComputerFactory{
    @Override
    public CPU createCPU() {
        return new IntelCPU();
    }

    @Override
    public GPU createGPU() {
        return new NvidiaGPU();
    }
}
