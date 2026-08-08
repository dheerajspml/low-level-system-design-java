package pizzashop.pizzastore.NyStylePizzaStore;

import pizzashop.pizza.*;
import pizzashop.pizza.ingradientfactory.NYPizzaIngredientFactory;
import pizzashop.pizza.ingradientfactory.PizzaIngredientFactory;
import pizzashop.pizza.types.CheesePizza;
import pizzashop.pizza.types.ClamPizza;
import pizzashop.pizza.types.PepperoniPizza;
import pizzashop.pizza.types.VeggiePizza;
import pizzashop.pizzastore.PizzaStore;

public class NyStylePizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equalsIgnoreCase("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } else if (type.equalsIgnoreCase("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (type.equalsIgnoreCase("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }


}
