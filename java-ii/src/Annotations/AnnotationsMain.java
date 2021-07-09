package Annotations;
//import java.util.List;
//import java.util.ArrayList;


class Red {
    public void show(){
        System.out.println("I am Red");
    }
    
    public void showTheColorThatILikeTheMostFromTheRainbow(){
        System.out.println("I am Red");
    }
    
}

class Orange extends Red{
    // this overrides the method in A
    public void show(){
        System.out.println("I am Orange");
    }
    
//    @Override
    public void showTheColorThatILikeTheMostfromTheRainbow(){
        System.out.println("I am Red");
    }
    


}

public class AnnotationsMain {

    public static void main(String[] args) {
        Red redObj = new Red();
        // this will call the method in class Red
        redObj.show(); // I am Red
        
        Orange orangeObj = new Orange();
        // this will call the method in class Orange
        orangeObj.show(); // I am Orange
        
    }
    
    


}
