package pl.przydan.builder;

import pl.przydan.builder.pizzabuilders.HawaiianPizzaBuilder;
import pl.przydan.builder.pizzabuilders.MargaritaPizzaBuilder;
import pl.przydan.builder.pizzabuilders.MeetPizzaBuilder;

public class MainBuilder {
    public static void main(String[] args) {
        Chef chef = new Chef();

        chef.bakePizza(new MargaritaPizzaBuilder());
        Pizza margarita = chef.getPizza();

        chef.bakePizza(new HawaiianPizzaBuilder());
        Pizza hawaiian = chef.getPizza();

        chef.bakePizza(new MeetPizzaBuilder());
        Pizza meetPizza = chef.getPizza();

        System.out.println(margarita.getIngredients());
        System.out.println(meetPizza.getIngredients());
    }
}
