package oop.animals;

public class SomethingsFishy {
    
    public static void main(String[] args) {
        
        // this allows us (because we have a default constructor)
        MarineAnimal marineAnimal = new AquaMammal("Blue Whale");
    
        System.out.println(marineAnimal.getName());
    }
}
