package pizzashop.pizza.ingradientfactory;

import pizzashop.pizza.ingradients.cheese.Cheese;
import pizzashop.pizza.ingradients.clams.Clams;
import pizzashop.pizza.ingradients.dough.Dough;
import pizzashop.pizza.ingradients.pepperoni.Pepperoni;
import pizzashop.pizza.ingradients.sauce.Sauce;
import pizzashop.pizza.ingradients.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
