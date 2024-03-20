package Builder;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .setCpu("Intel Core 7")
                .setRam("64GB DDR5")
                .setStorage("512TB SSD")
                .setScreenSize("1000 inch")
                .build();
        System.out.println(computer);
    }
}
