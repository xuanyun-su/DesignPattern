package Factory.MethodFactory;

public class Client {
    public static void main(String[] args) {
        DesktopFactory desktopFactory = new DesktopFactory();
        LaptopFactory laptopFactory = new LaptopFactory();
        Computer desktop = desktopFactory.createComputer();
        Computer laptop = laptopFactory.createComputer();
        System.out.println(desktop.getType());
        System.out.println(laptop.getType());

    }
}
