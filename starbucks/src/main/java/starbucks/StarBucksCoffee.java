package starbucks;

import starbucks.beverage.Beverage;
import starbucks.beverage.DarkRoast;
import starbucks.beverage.Expresso;
import starbucks.beverage.HouseBlend;
import starbucks.decorator.Mocha;
import starbucks.decorator.Soya;
import starbucks.decorator.Whip;
import starbucks.enums.Size;
import starbucks.enums.Type;

public class StarBucksCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new Expresso() ;
        beverage1.setType(Type.ICE);
       System. out.println(beverage1.getDescription()
                + " Rs" + beverage1.cost());

       Beverage beverage2 = new DarkRoast();
       beverage2.setSize(Size.SMALL);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " Rs" + beverage2.cost());
        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Size.LARGE);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Soya(beverage3);

        System.out.println(beverage3.getDescription()
                + " Rs" + beverage3.cost());

    }
}
