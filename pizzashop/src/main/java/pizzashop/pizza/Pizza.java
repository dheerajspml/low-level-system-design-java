package pizzashop.pizza;

import pizzashop.pizza.ingradients.cheese.Cheese;
import pizzashop.pizza.ingradients.clams.Clams;
import pizzashop.pizza.ingradients.dough.Dough;
import pizzashop.pizza.ingradients.pepperoni.Pepperoni;
import pizzashop.pizza.ingradients.sauce.Sauce;
import pizzashop.pizza.ingradients.veggies.Veggies;

public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Cheese cheese;
    public Veggies[] veggies;
    public Pepperoni peroni;
    public Clams clam;

    public abstract void prepare();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }


}
