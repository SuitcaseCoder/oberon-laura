package Company;

// how to add two interfaces in one class
public class Intern implements TalkToCustomers,AttendMeetings{
    
    @Override
    public void dailyStandUp() {
        System.out.println("This Intern takes notes during the daily " +
                                   "standup meeting");
    }
    
    @Override
    public void answerPhoneCalls() {
        System.out.println("This intern answers calls during lunch.");
    }
}
