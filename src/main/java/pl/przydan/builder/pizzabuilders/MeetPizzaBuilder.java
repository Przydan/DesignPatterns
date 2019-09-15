package pl.przydan.builder.pizzabuilders;

public class MeetPizzaBuilder extends PizzaBuilder {
    @Override
    public void makeDough() {
        this.pizza.setDough("Na cienkim");
    }

    @Override
    public void putSos() {
        this.pizza.setSos("Bazyliowy");
    }

    @Override
    public void putIngredients() {
        this.pizza.addIngredients("Mieso");
        this.pizza.addIngredients("Mieso");
        this.pizza.addIngredients("Mieso");
        this.pizza.addIngredients("Mieso");
        this.pizza.addIngredients("Mieso");
        this.pizza.addIngredients("Mieso");
    }
}
