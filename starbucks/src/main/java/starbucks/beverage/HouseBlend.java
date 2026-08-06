package starbucks.beverage;

public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return getSize() +" "+ getType() + " HouseBlend";
    }

    @Override
    public double cost() {
        return switch (getSize()) {
            case SMALL -> 120;
            case MEDIUM -> 130;
            case LARGE -> 135;
        };
    }
}
