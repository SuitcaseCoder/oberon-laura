package Exceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionsAndErrorHandling {
    public static void main(String[] args) {
        
        // COMMON EXCEPTION EXAMPLES
        // //parseInt Exception

        
        // // ArrayList Exception

//        CHECK ACCOUNT ELIGIBILITY

//        TRY- CATCH examples explained

//        TRY - CATCH
//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch (ArithmeticException e) {
//            System.out.println("Math still works!");
//        }
        
//        CHAINING CATCH & FINALLY
//        int[] numbers = {1, 2, 3};
//        int x;
//
//        try {
//            x = numbers[100];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Caught an array index exception!");
//        } catch (Exception e) {
//            System.out.println("Caught a generic exception!");
//        } finally {
//            System.out.println("This will always run.");
//        }
        
//        USING E - THE ERROR OBJECT
        int[] numbersTwo = {1, 2, 3};
        int y;

        try {
            y = numbersTwo[100];
        }
        catch (Exception e) {
            System.out.printf("Caught a generic exception: %s%n", e);
            String msg = e.getMessage();
            System.out.println(msg);
        }
    

    }
    
    // CHECK ELIGIBILITY METHOD
}
