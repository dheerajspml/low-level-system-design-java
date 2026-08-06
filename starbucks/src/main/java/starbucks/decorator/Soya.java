package starbucks.decorator;

import starbucks.beverage.Beverage;

public class Soya extends CondimentDecorator {
    public Soya(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return this.beverage.getDescription()+" Soya";
    }
    @Override
    public double cost() {
        return this.beverage.cost();
    }
}
