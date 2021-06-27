import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Intro

//        Immutability & Concatenation

//        example string concatenation:
//        String message = "Hello";
//        System.out.println(message); // prints "Hello"
//        message = message + " World!";
//        System.out.println(message); // prints "Hello, World!"
//
//

//        String Comparison
        String myFaveBand = "The Lumineers";
        System.out.println(
                myFaveBand.equalsIgnoreCase("the lumineers")); // true
        System.out.println(
                myFaveBand.equalsIgnoreCase("The Lumineers")); // true
        System.out.println(
                myFaveBand.equalsIgnoreCase("the Lumineers")); // true
        System.out.println(
                myFaveBand.equalsIgnoreCase("Lumineers")); // false
        
        
    }
}
