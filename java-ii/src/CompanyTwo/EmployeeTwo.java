package CompanyTwo;

//  create an abstract class using the `abstract` keyword
// abstract classes cannot be instantiated
// instantiation - to create an instance (an object) of that class
// create a subclass from the abstract and then instantiate the subclass
abstract class EmployeeTwo {
    // define properties
    private String salary;
    public String nameOfEmployee;
    public String department;
    
    // if you don't define method in abstract class, you must mark it
    // abstract
//    public abstract String doWork(int HourlyRate);
    
    // if you define the method in the abstract class, the abstract
    // keyword is not needed
    public String doWork(){
        return "I am working";
    };
    
    
    
    
}
