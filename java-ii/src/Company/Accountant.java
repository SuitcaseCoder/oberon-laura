package Company;

// Second class: Accountant( extends employee)
class Accountant extends Employee {
    public String work() {
        return "crunching numbers";
    }
    
    public static void main(String[] args) {
//        Employee Joe = new Employee();
//        System.out.println(Joe);
        Employee Employee3 = new Accountant();
        Employee3.name = "Federico";
        System.out.println(Employee3.name);
    }
}
