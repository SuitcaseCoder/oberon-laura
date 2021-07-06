package Company;

public class CustomerService implements TalkToCustomers{
    
    @Override
    public void answerPhoneCalls() {
        System.out.println("customer service answers incoming calls.");
    }
}
