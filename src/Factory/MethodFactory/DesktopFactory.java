package Factory.MethodFactory;



public class DesktopFactory extends ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Desktop();
    }
}
