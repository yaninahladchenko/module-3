package task3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.print();
        Employee employee2 = new Employee("Yanina", "Hladchenko");
        employee2.print();
    }
}































/*
public class EmployeeTest {
    private static void main(String[] args)
    {
        //Random myRandom = new Random();

        Employee me = new Employee("Yanina","Hladchenko",20);
        me.getName();
        System.out.print("My name is:" + me.getName());
        me.setName();
        System.out.print("My name is:" + me.getName());
    }
}
*/
