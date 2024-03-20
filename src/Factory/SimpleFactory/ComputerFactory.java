package Factory.SimpleFactory;


public class ComputerFactory {
    public static Computer createComputer(String type){
        if(type.equalsIgnoreCase("Desktop")){
            return new Desktop();
        }else if(type.equalsIgnoreCase("Laptop")){
            return  new Laptop();
        }else{
            return  null;
        }
    }
}
