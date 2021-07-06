package Company;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        SalesPerson salesPersonOne = new SalesPerson();
        salesPersonOne.answerPhoneCalls();

    
        System.out.println("---------------------------------");
        CustomerService cx = new CustomerService();
        cx.answerPhoneCalls();
    
    
        Intern temp = new Intern();
        System.out.println("---------------------------------");
        System.out.println("A day in the life of an Intern: ");
        temp.dailyStandUp();
        temp.answerPhoneCalls();
    
        System.out.println("---------------------------------");
    
    
    }
}
