package pl.przydan.builder.pizzabuilders;

public class MargaritaPizzaBuilder extends PizzaBuilder {
    @Override
    public void makeDough() {
        pizza.setDough("NaCienkim");
    }

    @Override
    public void putSos() {
        pizza.setSos("pomidorowy");
    }

    @Override
    public void putIngredients() {
        pizza.addIngredients("ser");
        pizza.addIngredients("bazylia");
    }
}
