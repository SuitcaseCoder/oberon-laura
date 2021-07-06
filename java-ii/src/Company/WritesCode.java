package Company;

// name usually refers to what the object is capable of doing
public interface WritesCode {
    Bug[] writeCode(int numberOfLines);
    
    boolean debug(Bug bug);
    
    void drinkCoffee();
    
    // could return null!
    StackOverflowLink searchForAnswer(Bug bug);
    
    BrokenKeyboard smashKeyboard(Keyboard k);
}