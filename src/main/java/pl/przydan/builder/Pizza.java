package pl.przydan.builder;

import java.util.ArrayList;

public class Pizza {
    // nasz produkt

    private ArrayList<String> ingredients = new ArrayList<>();
    private String dough;
    private String sos;

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void addIngredients(String ingredient) {
        this.ingredients.add(ingredient); 
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSos() {
        return sos;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }
}
