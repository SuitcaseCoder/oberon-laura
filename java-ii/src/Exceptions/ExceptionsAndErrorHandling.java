package Exceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionsAndErrorHandling {
    private static Object ArithmeticException;
    
    public static void main(String[] args) {
    
        // COMMON EXCEPTION EXAMPLES
        // //parseInt Exception
//        int myNum = Integer.parseInt("eighteen");
    
        // // ArrayList Exception
//        ArrayList<Integer> myArrList = new ArrayList<Integer>();
//        System.out.println(myArrList);
//        myArrList.get(2);
    
        // THROW
//        impossible(8,0);
//    }
////        THROW syntax
//        public static void impossible(int num1, int num2){
//            if(num2 == 1){
//                // throw
//                throw new ArithmeticException();
//            } else {
//                System.out.println(num1 / num2);
//            }
//        }


////        CHECK ACCOUNT ELIGIBILITY
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Let's see if you're eligible to appy for a " +
//                                   "new bank account at Bank Di Laura");
//        System.out.println("What's your age?");
//        int userAge = sc.nextInt();
//        System.out.println("How much money do you have?");
//        int userMoney = sc.nextInt();
//        checkAcctEligibility(userAge, userMoney);
//        System.out.println("Thanks for visiting Banco Di Laura");
//    }
//
//    static void checkAcctEligibility(int age, int amtSaved){
//        if(age < 16 && amtSaved < 200){
//            System.out.println("Sorry, you either don't have enough " +
//                                       "money or " +
//                                       "aren't old enough");
//            throw new ArithmeticException();
//        } else {
//            System.out.println("congratulations, you are eligible for a " +
//                                       "new bank account");
//        }
//    }


//        TRY- CATCH examples explained
//        try {
////            ... try some code ..
//        } catch(Exception e) {
////         ... handle that exception being thrown
//        }
//    }


//        TRY - CATCH
//        try {
//            System.out.println("Let's see...");
//            int result = 1 / 0;
//            System.out.println("I can divide by zero!");
//        } catch (ArithmeticException myException) {
//            System.out.println(myException);
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
//        int[] numbersTwo = {1, 2, 3};
//        int y;
//
//        try {
//            y = numbersTwo[100];
//        }
//        catch (Exception e) {
//            System.out.printf("Caught a generic exception: %s%n", e);
//            String msg = e.getMessage();
//            System.out.println(msg);
//        }


//    }
    }
    // CHECK ELIGIBILITY METHOD
}
