package oop.animals;

public class Fish extends MarineAnimal {
    
    private boolean hasScales;
    
    // create a constructor of our Fish class - command n > select
    // everything > a constructor will be created
    public Fish(
            boolean canSwim, int length, int finCount, boolean isSaltWater,
            String name, boolean hasScales
    ) {
        super(canSwim, length, finCount, isSaltWater, name);
        this.hasScales = hasScales;
    }
    
    public Fish(String name) {
        super(name);
    }
    
    public boolean getHasScales() {
        return hasScales;
    }
    
    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }
}
