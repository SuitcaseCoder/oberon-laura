package Instrument;

public abstract class Instrument {
    // declare fields
    protected String name;
    protected boolean hasStrings;
    public Instrument(String name, boolean hasStrings) {
        this.name = name;
        this.hasStrings = hasStrings;
    }
    // declare non-abstract methods
}
