package CompanyTwo;

// extends keyword to create a  sublcass of the EmployeeTwo abstract class
public class ManagerTwo extends EmployeeTwo{

//    public String work() {
//        return "crunching numbers";
//    }
    
    public static void main(String[] args) {
        ManagerTwo Susy = new ManagerTwo();
        Susy.nameOfEmployee = "Susy";
        Susy.department = "Marketing";
        System.out.println(Susy.nameOfEmployee + " works as a manager in" +
                                   " the: " + Susy.department);
        
        // we don't know what the implementation of this is yet
        EmployeeTwo Bob;
        // logic goes here
        Bob = new ManagerTwo();
        
        
        Bob.nameOfEmployee = "Bob";
        Bob.department = "Sales";
        System.out.println(Bob.nameOfEmployee + " works as a manager in" +
                                   " the: " + Bob.department);
    }
    
    
    
}