package CompanyTwo;

// extends keyword to create a  sublcass of the EmployeeTwo abstract class
public class ManagerTwo extends EmployeeTwo{

//    public String work() {
//        return "crunching numbers";
//    }
    
    public static void main(String[] args) {
//        Employee Joe = new Employee();
//        System.out.println(Joe);
        ManagerTwo Susy = new ManagerTwo();
        Susy.nameOfEmployee = "Susy";
        System.out.println(Susy.nameOfEmployee);
    }
    
    
    
}