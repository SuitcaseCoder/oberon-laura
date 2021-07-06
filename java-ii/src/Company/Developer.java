package Company;

// extends Employee to create a Developer class
class Developer extends Employee {
    
    // calls on the work() method;
    public String work() {
        return "answering phone calls";
    }
    
    public static void main(String[] args) {
        Developer one = new Developer();
        one.name = "Andrea";
        System.out.println(one.name + " is a Developer and should be: " + one.work() + " when she's at work.");
    }
}