package starbucks.beverage;

import starbucks.enums.Size;
import starbucks.enums.Type;


public abstract class Beverage {
    String  description = "Unknown Beverage" ;
    private Size size = Size.MEDIUM;
    private Type type = Type.HOT;
    public String getDescription() {
        return description;
    }
    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }
    public  abstract double cost();

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
