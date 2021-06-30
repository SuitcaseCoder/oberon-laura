package oop;

// anyone who can access
public class ObjectOrientedProgramming {
    public static void main(String[] args) {
//        FIRST EXAMPLE
//        // tell me about a person
//        Person person = new Person("Laura", 30, "short", "whoKnows");
////         this will not be visible if the name property is set to
////         private in the Person class. (person file)
////        person.name;
//        System.out.println(person);

//        SECOND EXAMPLE
        Person personTwo = new Person();
        personTwo.setNameOfPerson("LauraTwo");
        // this returns the name of this instance of the class and
        // returns a copy of the name
        System.out.println(personTwo.getNameOfPerson());
        
    }
    
    // STATE MANAGEMENT

}
