package starbucks.beverage;

public  class Expresso extends Beverage {
    @Override
    public String getDescription() {
        return getSize() + " "+ getType() + " Expresso";
    }
    @Override
    public double cost() {
        return switch (getSize()) {
            case SMALL -> 110;
            case MEDIUM -> 120;
            case LARGE -> 135;
        };
    }
}
