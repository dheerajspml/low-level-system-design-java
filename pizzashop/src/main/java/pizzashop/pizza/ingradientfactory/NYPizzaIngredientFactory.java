package pizzashop.pizza.ingradientfactory;

import pizzashop.pizza.ingradients.cheese.Cheese;
import pizzashop.pizza.ingradients.cheese.ReggianoCheese;
import pizzashop.pizza.ingradients.clams.Clams;
import pizzashop.pizza.ingradients.clams.FreshClams;
import pizzashop.pizza.ingradients.dough.Dough;
import pizzashop.pizza.ingradients.dough.ThinCrustDough;
import pizzashop.pizza.ingradients.pepperoni.Pepperoni;
import pizzashop.pizza.ingradients.pepperoni.SlicedPepperoni;
import pizzashop.pizza.ingradients.sauce.MarinaraSauce;
import pizzashop.pizza.ingradients.sauce.Sauce;
import pizzashop.pizza.ingradients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {

        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}









