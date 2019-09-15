package pl.przydan.builder.pizzabuilders;

public class HawaiianPizzaBuilder extends PizzaBuilder {

    @Override
    public void makeDough() {
        pizza.setDough("NaGrubym");
    }

    @Override
    public void putSos() {
        pizza.setSos("pomidorowy");
    }

    @Override
    public void putIngredients() {
        pizza.addIngredients("ser");
        pizza.addIngredients("ananas");
        pizza.addIngredients("szynka");
    }

}
