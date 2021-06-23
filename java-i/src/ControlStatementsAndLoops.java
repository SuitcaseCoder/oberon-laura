import java.util.Scanner;

public class ControlStatementsAndLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        control flow:


//        boolean expressions:
//        && relational operators (think strict?)
//        equality ==
//        inequality !=
//        greater than > // >=
//        less than < // <=
        
//        String myFaveAnimal = "frog";
//        System.out.println(myFaveAnimal);
//
//
//        int chanceOfRain = 60;
//        if(chanceOfRain >= 50){
//            System.out.println("stay inside");
//        }

//        ** && will stop evaluating if the first condition is false
//        ** & will still read both conditions no matter what - is a
////        bitwise so it checks it bit by bit
//        boolean isWarm = false;
//        boolean isSunny = true;
//        if(isWarm && isSunny){
//            System.out.println("1st: go swimming");
//        }
//
//        if(isWarm & isSunny){
//            System.out.println("2nd: go swimming");
//        }

//
//        if(isWarm || isSunny){
//            System.out.println("go swimming");
//        }
//
//        if(isWarm | isSunny){
//            System.out.println("2nd go swim");
//        }


////        STRING COMPARISON Java
//        String myName = "Laura";
//        String yourName = "laura";
////    ****
////        .equals()
//        System.out.println(myName.equals(yourName));
////        .equalsIgnoreCase
//        System.out.println(myName.equalsIgnoreCase(yourName));
        
//        CONTROL STRUCTURES
//
//        IF STATEMENT
//        if(/*condition*/){
////            execute code if condition is met to be true
//        }
        
//        if(yourName.equalsIgnoreCase(myName)){
//            System.out.println("we are twins that is it.");
//        }


//        MINI EXERCISE:
//        String user1 = "puppiesRock82";
//        String user2 = "frogsAreCoolerThanToads90";
//        String user3 = "littleEinsteins21";
//
//
//        System.out.printf("Please enter a username: ");
//        String user4 = scanner.next();
//        System.out.println(user4.equals(user1)); // boolean
//
////
//        if(user4.equals(user1) || user4.equals(user2) || user4.equals(user3)) {
////            System.out.printf("your username: %s , has already been taken",
////                    user4);
//        } else {
////            System.out.printf("congrats %s, your username has been " +
////                                      "registered", user4);
//        }
        

//        SWITCH STATEMENTS
//        char grade = 'F';
//
//        switch( grade ){
//            case 'A' :
//                System.out.println("GREAT JOB!! STELLAR! AMAZING!");
//                break;
//            case 'B':
//                System.out.println("great job!");
//                break;
//            case 'C':
//                System.out.println("fair maybe study more");
//                break;
//            case 'D' :
//                System.out.println("ouch let's try again!");
//                break;
//            default:
//                System.out.println("grades are just letters");
//        }


////        TODO: refactor previous mini exercise into a switch statement
//        String user1 = "firstUser";
//        String user2 = "secondUser";
//        String user3 = "thirdUser";
//
//
//        System.out.printf("Please enter a username: ");
//        String user4 = scanner.next();
//        System.out.println(user4.equals(user1)); // boolean
//
////        switch cases looks for something that evaluates to a boolean
////        ** see type inversion
//        switch(user4){
//            case "user1":
//                System.out.println("nope, try again");
//                break;
//            case "user2":
//                System.out.println("already taken!");
//                break;
//            case "user3":
//                System.out.println("better luck next time");
//                break;
//            default:
//                System.out.println("Sweet! user4 has been created");
//        }

//         while vs do...while loop:
//        condition is checked before
//        do ... while will always be executed first before condition is
//        met
        
//        int myNum = 0;
//
//        while(myNum <= 10){
//            System.out.println(myNum);
//            myNum++;
//        }

//        do ...while
//        do {
//            System.out.println(myNum);
//            myNum++;
//        } while (myNum <= 10);


//        for ... loop

//        int myNum = 18;
        
        for(int myNum = 0; myNum <= 20; myNum++){
            System.out.println(myNum);
        }

        




//        logical operators


//        string comparison

//        control structures

//        if statement

//        MINI EXERCISE

//        switch && break and continue

//        while


//        do while
    
    
    }
    
}
