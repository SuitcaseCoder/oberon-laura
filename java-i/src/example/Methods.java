package example;

import java.util.Scanner;

public class Methods {
    
    //    syntax
//    public - how visible your method is to other classes.
//    static - available for this class and not an instance of a class
//     void, String, int - define what the data type is of what's being
//     returned (if anything is being returned)
//    main, nameOfTheMethod - name of the method - you come up with that
//    (dataType params) - parameters go in the parenthesis with the data
//    type defined
//    { /* your code /code block goes here *(/ }


//     ABOUT THE MAIN METHOD
//    required to have an entry point
//    not required when we run it server-side
//    public static void main(String[] args) {
////        System.out.println("hello world");
////
////        System.out.println(greeting("twenty-four")); //24
//
//        System.out.println(myTeam("los spurs"));
//
//        System.out.println(teamLength(myTeam("los spurs")));
//
//        return;
//
//
//    }

//    what a method will expect:
//    1 ) it for sure is going to have a return statement
//    2 ) it's going to expect the return to actually return a String
//    data type
//    public static int greeting(String age){
//        System.out.println("age: " + age);
//        int indexOfR = age.indexOf('r');
//        return indexOfR;
//    }

//    TODO: create a new method that accepts the name of a basketball
//     team (ex: the spurs) and returns a String that says
//     "[basketballTeam] is the best team.". Invoke that method within
//     your main method (remember to pass in the name of the basketball
//     team). print out the result of the new method.

//    public static String myTeam(String bballTeam){
//        return bballTeam + " is the best team";
//    }
//
////    TODO: create a new method that accepts the string created from the
////     first method and returns the number of characters in that string.
//
//    public static int teamLength(String teamSentence){
//        return teamSentence.length();
//    }
    
    
//    public static void main(String[] args) {
//        System.out.println(greeting(2, 4, 6));
//    }
//
////   METHOD OVERLOADING
//
//    public static void greeting() {
//        System.out.println("hello world");
//    }
//
//    public static void greeting(String oneGreeting) {
//        System.out.println(oneGreeting);
//    }
//
//    public static int greeting(int randomNum) {
//        System.out.println(randomNum);
//        return randomNum + 2;
//    }
//
//
//    public static void greeting(char letter) {
//        System.out.println(letter);
//    }
//
//////    you cannot repeat the same expectations
////    public static void greeting(int anotherNum){
////        System.out.println(anotherNum + " "+ andAnotha);
////    }
//
//    public static int greeting(int first, int second, int third) {
//        int sum = first + second + third;
//        return sum; //int
//    }


//    TODO: invoke a method that accepts (and returns) the following:
//        - accepts: your first name and your last name. returns: A
//        string that reads: "Hello Laura Ruiz-Roehrs (replace with your
//        first and last)";
//        - accepts: your age. returns: "that's crazy! you don't look
//        100 years old!"
//        - accepts: your favorite quote. returns: "your fave quote"


//    WARMUP
//    TODO: prompt a user to tell us about themselves (age, name, if
//     they have any pets (true/false). Using method overloading, create
//     methods that will return the first fact they told us about
//     themselves. ex: I can input: 18 -- Laura -- false in which case I
//     expect you to return: 18. but if I tell you my name first: Laura --
//     false -- 18. I expect you to return "Laura" ... etc.


//    Pass by Methods
    
    
//    public static void main(String[] args) {
//        String tryChangingMe = "hello hello!"; // ORIGINAL REFERENCE
//        changeString(tryChangingMe);
////         hello hello --> something new
//        System.out.println(tryChangingMe); // we're referencing
//        // the original value/reference // --> something new
//
//    }
//
//    public static void changeString(String randomString){
//        System.identityHashCode(randomString);
//        System.out.println(randomString); // hello hello
//        randomString = "something new"; // hello hello --> something new
//        System.out.println(randomString); // we're referencing the value
//        // that was passed in (copy) which we changed
//    }
    

////     pass by value
//    public static void main(String[] args) {
////        int -- primitive data type
////        Integer -- Object
////        String -- object -- the reason why you can't compare strings
////        using == we have to use methods
////        boxed object
//
//
//        Integer numero = 10; // creating an instance of Integer
//        System.out.println(numero.hashCode()); // 10
//        System.out.println(returnNum(numero).hashCode()); //10
//    }
//
//    public static Integer returnNum(Integer randomNum){
//        System.out.println(randomNum.hashCode()); // 11
////        randomNum++;
//        System.out.println(randomNum.hashCode()); // 11
//        return randomNum; // shallow copy
//    }
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//        anotherMethod(num);
//        System.out.println("num after calling method: " + num); //
//    }
//
//    public static void anotherMethod(int randomNum){
//        System.out.println("randomNum at start of " +
//                                   "antoherMethod: " + randomNum); //
//
//        randomNum = randomNum + 5;
//        System.out.println("randomNum after addition in " +
//                                   "anotherMethod: " + randomNum); //
//    }
//

//      recursion: a method that calls itself internally, require some
//      kind of "stopping point", also will need a new/different
//      argument to get passed in every time.

//    why you'd use it: continue running program without the need of a
//    loop. A loop saves every loop in a new spot in memory recursion
//    doesn't.
    
//    public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//        System.out.println(" How many seats are there in the movie " +
//                                   "theatre?");
//        int seatsLeft = sc.nextInt();
//        movieTheatre(seatsLeft);
//    }
//
//    public static void movieTheatre(int numSeats){
//        if(numSeats > 0) {
//            System.out.println("there are " + numSeats + " available.");
//
//            numSeats--;
//            System.out.println("numSeats: " + numSeats);
//            movieTheatre(numSeats);
//        }
//
//    }
    
//    TODO: you are a sports manager. Prompt your client who is training
//     for a marathon how many miles they have to run today. You're the
//     coach, so you decide how many miles they ran that day. print out
//     how many miles they have left in training until they have 0 miles
//     left.

// ----------- exercises -------------


//    1.
//    public static void main(String[] args) {
//        System.out.println( addition(2,4));
//        System.out.println(subtraction(100, 28));
//        System.out.println(multiplication(5,9));
//        System.out.println(division(45,21));
//
//    }
//
//
//    public static int addition(int num1, int num2){
//            int sum = num1 + num2;
//            return sum;
//    }
//
//    public static int subtraction(int num1, int num2){
//        int difference = num1 - num2;
//        return difference;
//    }
//
//    public static int multiplication(int num1, int num2){
//        int product = num1 * num2;
//        return product;
//    }
//
//    public static int division(int num1, int num2){
//        int quotient = num1 / num2;
//        return quotient;
//    }


////    2.
//public static void main(String[] args) {
//
//getInteger(1,10);
//}
//
//    public static int getInteger(int min, int max) {
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter a number between 1 and 10");
//    int userInput = sc.nextInt();
//        if(userInput >= min && userInput <= max){
//            System.out.println("excellent! you win!");
//            return userInput;
//        } else {
//            System.out.println("Sorry, please try again. Your number is " +
//                                       "out of range");
//            return getInteger(1,10);
//        }
//
//    }
    
//    //    2. -version two
//    public static void main(String[] args) {
//        int validInput = getInteger(1,10, new Scanner(System.in));
//        System.out.printf("You entered a valid number: %s", validInput);
//    }
//
//
//    //    this allows us to use just one Scanner object rather than creating
//    //    a new Scanner at every recursion
//    public static int getInteger(int min, int max, Scanner sc) {
//        System.out.print("Enter a number between 1 and 10");
//        int userInput = sc.nextInt();
//        if (userInput >= min && userInput <= max) {
//            System.out.println("excellent! you win!");
//            return userInput;
//        } else {
//            System.out.println("Sorry, please try again. Your number is " +
//                                       "out of range");
//            return getInteger(1, 10, sc);
//        }
//    }
//    }

//    //    3.
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("please enter a number:");
//        int userInput = sc.nextInt();
//
//        System.out.println(factorial(userInput));
//    }
//
//    public static int factorial(int num){
//        if(num == 1) {
//            return 1;
//        }
//        int result = factorial(num - 1) * num;
//        return result;
//    }

//    // 4. Roll dice
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number of sides:");
        int userInput = sc.nextInt();
        System.out.println(rollDice(userInput));
}

public static String rollDice(int sides){
    int firstNum = (int) (Math.random() * sides);
    int secondNum = (int) (Math.random() * sides);
    
    return "You rolled a " + firstNum + " and a " + secondNum;
    
}


//    }
    
    
}
