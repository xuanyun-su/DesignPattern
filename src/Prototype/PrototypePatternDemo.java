package Prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        Employee employee1= new Employee("John", 30, "IT");
        Employee employee2 = (Employee) employee1.clone();

        System.out.println("employee1 = " + employee1);
        System.out.println("employee2 = " + employee2);

        employee2.setAge(35);
        employee2.setDepartment("Fiance");

        System.out.println("employee1 = " + employee1);
        System.out.println("employee2 = " + employee2);
    }
}
