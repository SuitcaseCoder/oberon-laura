package Annotations;
import java.util.List;
//import java.util.ArrayList;

// red

//orange


import java.util.ArrayList;

public class AnnotationsMain {


//// should give us warning because the expected return type and actual return type are different
////    @SuppressWarnings("unchecked")
//    public List<String> languages(){
//        return new ArrayList();
//    }
    
    public static void main(String[] args) {
        // suppress warning - suppresses any warnings
        @SuppressWarnings("unused")
        int randomNum = (int) (Math.random()*10);
        
    }
    
    // @Override - checks to see if the parent class has the same method
    // tells the compiler that the method will be override
    // meet the specs of a particular class in which you're using the
    // method
    // catch any error - at compile
    
    
    
    


}


