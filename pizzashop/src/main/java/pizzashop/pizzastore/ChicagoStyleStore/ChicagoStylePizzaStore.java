package pizzashop.pizzastore.ChicagoStyleStore;

import pizzashop.pizza.Pizza;

import pizzashop.pizza.ingradientfactory.ChicagoIngredientFactory;

import pizzashop.pizza.ingradientfactory.PizzaIngredientFactory;
import pizzashop.pizza.types.CheesePizza;
import pizzashop.pizza.types.ClamPizza;
import pizzashop.pizza.types.PepperoniPizza;
import pizzashop.pizza.types.VeggiePizza;
import pizzashop.pizzastore.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new ChicagoIngredientFactory();
        if (type.equalsIgnoreCase("Cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("chicago CheesePizza");

        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("chicago VeggiePizza");

        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("chicago PepperoniPizza");
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("chicago ClamPizza");
        }
        return pizza;
    }
}
