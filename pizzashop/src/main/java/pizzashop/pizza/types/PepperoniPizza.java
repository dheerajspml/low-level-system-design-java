package pizzashop.pizza.types;

import pizzashop.pizza.Pizza;
import pizzashop.pizza.ingradientfactory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        peroni = pizzaIngredientFactory.createPepperoni();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
