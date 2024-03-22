package facade;

public class FacadeDemo {
    public static void main(String[] args) {
        Facade facade = new Facade();

        System.out.println("Operation 1:");
        facade.operation1();

        System.out.println("\nOperation 2:");
        facade.operation2();
    }
}
