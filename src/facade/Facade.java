package facade;

public class Facade {
    private SubSystemA subSystemA;
    private SubSystemB subSystemB;
    private SubSystemC subSystemC;

    public Facade() {
        subSystemA = new SubSystemA();
        subSystemB = new SubSystemB();
        subSystemC = new SubSystemC();
    }

    public  void operation1(){
        subSystemA.operationA();
        subSystemB.operationB();
    }

    public void operation2(){
        subSystemB.operationB();
        subSystemC.operationC();
    }
}
