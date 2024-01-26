package oop.exercise.pizzastore.pizza.ny;

import oop.exercise.pizzastore.IngredientFactory;
import oop.exercise.pizzastore.pizza.CheezePizza;

public class NYCheezePizza extends CheezePizza {
    public NYCheezePizza(IngredientFactory ingredientFactory, String regionName) {
        super(ingredientFactory, regionName);
    }
}
