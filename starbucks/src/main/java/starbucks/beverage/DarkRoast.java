package starbucks.beverage;

public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        return getSize()+" "+ getType() + " DarkRoast";
    }
    @Override
    public double cost() {
        return switch (getSize()) {
            case SMALL -> 100;
            case MEDIUM -> 110;
            case LARGE -> 125;
        };
    }
}
