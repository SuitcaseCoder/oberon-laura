import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

////        warmup:
////        TODO: create a new "Strings-Lecture" java class file (or wherever
////         you like to keep notes/lecture exercises. Copy given
////         code, that is your starting point. Using Scanner prompt a
////         user (in this case it's you, you're the user) to type in
////         their first name. Save the input into a String variable. If
////         your name matches randomName, print "woah! you guessed:
////         enter-randomName-here! How did you know enter-yourName-here
////         is my name?!". if randomName does
////         not
////         match your name exactly, print "Way off my friend! My name
////         isn't randomName-here. It's yourName-here.".
//
//        String[] studentsArr =
//                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
//                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
//                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
//                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
//                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
//                        "Casey", "Dorian", "Tristan", "Jordy"};
//
//        int randomNum = (int) (Math.random() * 28);
//        String randomName = studentsArr[randomNum];
//        //        solution:
//        System.out.println("enter your first name: ");
//        String myName = sc.next();
//        System.out.format("hello, replace this with %s%n", randomName);
//        System.out.printf("%n hi print a variable here: %s", randomName);
//
//
//        if (randomName.equals(myName)) {
////            System.out.println("Woah, you guessed: " + randomName +
////                                       "!!" + "How did you know my name is: " + myName);
//        } else {
////            System.out.println(
////                    "way off my friend! My name isn't " + randomName +
////                            ", it's " + myName);
//        }
//


//        Intro
//          String: a non-primitive data type, refer to an objects
//        String msg = "hello";
//        System.out.println(msg);
//        msg = msg + ", how are you?";
//        System.out.println(msg);


//        Immutability & Concatenation


//        example string concatenation:
//        String message = "Hello";
//        System.out.println(message); // prints "Hello"
//        message = message + " World!";
//        System.out.println(message); // prints "Hello, World!"
//
//

//        String Comparison
//          --> return true or false
//        syntax: couchYou'reComparingTo.stringComparison("pillow");

//        .equals()
//        System.out.println("do you like pizza? [y/n]? ");
//        String userInput = sc.next();
//        System.out.println(userInput);
//        if(userInput.equals("y")){
//            System.out.println("yes I like pizza");
//        } else {
//            System.out.println("no pizza for me. I'm crazy");
//        }
        
//        .equalsIgnoreCase()
//        comparingToThis.equalsIgnoreCase()("what you're comparing");

//        System.out.println("What's your name");
//        String userInput = sc.next();
//        System.out.println(userInput);
//        if(userInput.equals("Laura")){
//            System.out.println("yes that's my name exactly");
//        } else if (userInput.equalsIgnoreCase("Laura")){
//            System.out.println("That's my name but you forgot to " +
//                                       "capitalize a letter");
//        } else {
//            System.out.println("that's not my name!");
//        }

//        .startsWith() : compare the first word and see if it is a
//        match, case-sensitive
//        String myFaveBand = "The Lumineers";
////        String upper = myFaveBand.toUpperCase();
//        System.out.println((myFaveBand.toUpperCase()).startsWith("the".toUpperCase()));
        // false
//        System.out.println(myFaveBand.startsWith("The")); // true
//        System.out.println(myFaveBand.startsWith(" The")); // false
//        System.out.println(myFaveBand.startsWith("The ")); // true




//        .endsWith() - compare the last word in the orginal String,
//        case-sensitive
        String myFaveBand = "The Lumineers";
        System.out.println(myFaveBand.endsWith("Lumineers")); // false
        
//        TODO: create a String variable that holds this sentence: "Red
//         Orange Blue Yellow Green Purple". Prompt the user to type in
//         their favorite color, if their fave color is the same as the
//         first word in the String, then print out "my fave color:
//         userColor is the first one"
//


//        STRING MANIPULATION  METHODS

//        charAt():

//        indexOf():

//        lastIndexOf():

//        length():

//        replace():

//        substring():

//        toLowerCase();

        
//        toUpperCase():

//        trim():

    
    
    }
}