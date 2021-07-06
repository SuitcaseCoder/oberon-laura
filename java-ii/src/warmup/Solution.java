package warmup;

public class Solution {
    public static void main(String[] args){
        Parent ParentObj = new Parent();
        SubClass SubClassObj = new SubClass();
        ParentObj.ParentMethod();
        SubClassObj.SubclassMethod();
        SubClassObj.ParentMethod();
    }
}
