package Company;

// implement the name of the Interface you want to implement
public class SalesPerson implements TalkToCustomers {
    @Override
    public void answerPhoneCalls() {
        System.out.println("Sales person answers phone calls to " +
                                   "returning customers");
    }
    
    // we're overriding the coldCall method

    
    // if interface has undefined methods, those have to be defined here
    
}
