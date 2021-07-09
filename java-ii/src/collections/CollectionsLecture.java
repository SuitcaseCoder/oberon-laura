package collections;
import java.util.ArrayList;

public class CollectionsLecture {
    public static void main(String[] args) {
//        only one arrayList was made
        ArrayList<String> stringArr = new ArrayList<>();
    
//        Add to arrayList
        stringArr.add("Laura");
//        print stringArr
        System.out.println(stringArr);
//        print arrayList size
        System.out.printf("Current stringArr size is: %s\n", stringArr.size());
//        get element in 0 position from array list
        System.out.println(stringArr.get(0));
//        print hashcode of stringArr
        System.out.println(stringArr.hashCode());
    
    
        stringArr.add("Casey");
        System.out.println(stringArr);
        System.out.printf("Current stringArr size is: %s\n", stringArr.size());
        System.out.println(stringArr.get(1));
//        this prints out a new hashcode -but it's different than the
//        original arrayList
        System.out.println(stringArr.hashCode());
    
    }

    
}
