package Factory.SimpleFactory;

public class Client {
    public static void main(String[] args) {
        Computer desktop = ComputerFactory.createComputer("Desktop");
        Computer laptop = ComputerFactory.createComputer("Laptop");
        System.out.println(desktop.getType());
        System.out.println(laptop.getType());
    }
}
