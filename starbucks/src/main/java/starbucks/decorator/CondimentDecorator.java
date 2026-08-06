package starbucks.decorator;

import starbucks.beverage.Beverage;
import starbucks.enums.Size;

public abstract class CondimentDecorator  extends Beverage {
    Beverage beverage;

    @Override
    public Size getSize() {
        return  beverage.getSize();
    }
    @Override
    public  void setSize(Size size) {
        beverage.setSize(size);
    }
    public abstract String  getDescription() ;

}
