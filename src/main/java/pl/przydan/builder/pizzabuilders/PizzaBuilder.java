package pl.przydan.builder.pizzabuilders;

import pl.przydan.builder.Pizza;

public abstract class PizzaBuilder {
    protected Pizza pizza = new Pizza();

    public abstract void makeDough();
    public abstract void putSos();
    public abstract void putIngredients();

    public Pizza getPizza() {
        return pizza;
    }

}
