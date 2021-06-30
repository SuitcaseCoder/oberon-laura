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
        // static -> makes this variable constant with every instance of
        // this class
        private static final boolean hasSkin = true;

//    Constructor - a special method in a class that tells java to make
//    a class of this class (allows us to create an instance of a Person
//    class). constructors have to be named the same of the class
        // because this is set to public i can inject values into this
// person
        public Person(String nameOfPerson, int ageOfPerson,
                String heightOfPerson, String nationalityOfPerson) {
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
        
        // this empty constructor is needed if we want to make an
        // instance of the Person class without any 'injectables'
        // (potential arguments)
        public Person(){
        }
        
    

//    Properties - methods on the classes that help us execute behavior
//    of an object

    // command + n
    // click getter and setter
    // these are going to create 'getter' and 'setter' properties on the
    // class for the properties we choose
    //
    
    // since original nameOfPerson is set to private I can't access it
    // in an instance of this class but since I am setting a public
    // method then anyone can get/set the nameOfPerson - this allows
    // people to get the name
    public String getNameOfPerson() {
        return nameOfPerson;
    }
    
    // this allows others to set or re-assign the name
    public void setNameOfPerson(String nameOfPerson) {
            // this - means this instance of the person (from wherever
        // setNameOfPerson is being called from
        this.nameOfPerson = nameOfPerson;
    }
    
    public int getAgeOfPerson() {
        return ageOfPerson;
    }
    
    public void setAgeOfPerson(int ageOfPerson) {
        this.ageOfPerson = ageOfPerson;
    }
    
    public String getHeightOfPerson() {
        return heightOfPerson;
    }
    
    public void setHeightOfPerson(String heightOfPerson) {
        this.heightOfPerson = heightOfPerson;
    }
    
    public String getNationalityOfPerson() {
        return nationalityOfPerson;
    }
    
    public void setNationalityOfPerson(String nationalityOfPerson) {
        this.nationalityOfPerson = nationalityOfPerson;
    }
    
    public static boolean isHasSkin() {
        return hasSkin;
    }
    


}
