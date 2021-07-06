package Company;


class Accountant extends Employee {
    //must define a work method because it inherits
    // from Employee and is not defined as abstract
    public String work() {
        return "crunching numbers";
    }
    
    public static void main(String[] args) {
//        Employee Joe = new Employee();
//        System.out.println(Joe);
        Employee Susy = new Accountant();
        Susy.name = "Susy";
        System.out.println(Susy.name);
    }
    
}