package Annotations;


//@Deprecated
public class Vehicle {
    
    public String name;
    public String size;
//    @Deprecated
    public String territory;
    
    public static void main(String[] args) {
        Vehicle train = new Vehicle();
        train.name = "train";
        train.size = "large";
        train.territory = "railroad tracks";
    
//        @Deprecated
        String aboutVehicle =
                "The " + train.name + " is a cool " + "vehicle," +
                        " because it moves forward on: " + train.territory;
        System.out.println(aboutVehicle);
    }
    
}
