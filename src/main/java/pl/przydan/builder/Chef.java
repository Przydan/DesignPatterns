package pl.przydan.builder;

import pl.przydan.builder.pizzabuilders.PizzaBuilder;

public class Chef {
    private Pizza bakedPizza;

    public void bakePizza(PizzaBuilder pizzaBuilder) {
        pizzaBuilder.makeDough();
        pizzaBuilder.putSos();
        pizzaBuilder.putIngredients();
        bakedPizza = pizzaBuilder.getPizza();
    }

    public Pizza getPizza() {
        return bakedPizza;
    }

}
