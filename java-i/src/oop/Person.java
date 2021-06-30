package oop;

// public - anyone who has access to the oop package can see this
public class Person {
//    Field - actual objects and primitives that help describe the
//    characteristics of a class. just data nothing more nothing less.
//    fields are private outside of this class. nothing can directly
//    access this field
//    every field gets an access modifier - changes the visibility of
//    something
        private String nameOfPerson;
        private int ageOfPerson;
        private String heightOfPerson;
        private String nationalityOfPerson;

//    Constructor - a special method in a class that tells java to make
//    a class of this class (allows us to create an instance of a Person
//    class)
        // because this is set to public i can inject values into this
// person
        public Person(String nameOfPerson, int ageOfPerson,
                String heightOfPerson, String nationalityOfPerson){
            // inject these values into the fields
            // this - refers to the Person class created at the top of
            // this file
            // this.nameOfProperty = is being set equal to whatever gets
            // passed into the method as arguments (see Object Oriented
            // Programming File)
            this.nameOfPerson = nameOfPerson;
            this.ageOfPerson = ageOfPerson;
            this.heightOfPerson = heightOfPerson;
            this.nationalityOfPerson = nationalityOfPerson;
            
        }
    

//    Properties - methods on the classes that help us execute behavior
//    of an object


}
