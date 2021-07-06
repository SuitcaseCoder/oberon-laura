package CompanyTwo;

public class TeamLead implements Timesheets, FirePower{
    
    @Override
    public void fillOutTimesheets() {
        System.out.println("Team Lead is filling out Timesheets.");
    }
    
    @Override
    public void firePeople(){
        System.out.println("you are fired! later!");
    };
    
    
}
