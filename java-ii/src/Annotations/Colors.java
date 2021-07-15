package Annotations;

import com.ibm.jvm.Debuggable;

class Red {
    public void showMyFavoriteColorOfAllTimefromTheRainbow(){
        System.out.println("I am red");
    }
    
}

class Orange extends Red{
//    @Override // comments for the compiler // it check sto see if that
    // comment is doing what it's supposed to
    
    // hey this method should be overriding the method in its parent
    // class of red
//    @Override
    public void showMyFavoriteColorOfAllTimeFromTheRainbow(){
        System.out.println("I am orange");
    }
}

public class Colors {
    public static void main(String[] args) {
        Red redobj = new Red();
        Orange orangeobj = new Orange();
        redobj.showMyFavoriteColorOfAllTimefromTheRainbow();    // I am red
        orangeobj.showMyFavoriteColorOfAllTimefromTheRainbow(); // I am
        // orange
    }
}

//@Deprecated
// usually above methods
