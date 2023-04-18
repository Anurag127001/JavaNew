
class Employee{
    int id;
    int salary;
    String name;
    public void  printDetails(){
        System.out.printf("My id is %d, and my name is %s .\n", id, name);
    }

    public int getSalary(){
        return salary;
    }
}
public class CWH_38_CreatingCustomClass {
    public static void main(String[] args) {

        Employee harry = new Employee();  // Instantiating a new Employee Object
        Employee john = new Employee();

        // Setting attrinutes for harry
        harry.id =12;
        harry.name = "CodeWithHarry";
        harry.salary = 18000;

        john.id = 13;
        john.name = "John Locke";
        john.salary = 12000;


        // Printing the attributes
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);


    }
}
