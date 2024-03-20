package Factory.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        ComputerFactory intelFactory = new IntelFactory();
        CPU intelCPU = intelFactory.createCPU();
        GPU intelGPU = intelFactory.createGPU();

        System.out.println(intelCPU.getType());
        System.out.println(intelGPU.getType());
        ComputerFactory amdFactory = new AMDFactory();
        CPU amdCPU = amdFactory.createCPU();
        GPU amdGPU = amdFactory.createGPU();
        System.out.println(amdCPU.getType());
        System.out.println(amdGPU.getType());
    }
}
