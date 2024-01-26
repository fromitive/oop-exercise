package oop.exercise.pizzastore.pizza.ny;

import oop.exercise.pizzastore.IngredientFactory;
import oop.exercise.pizzastore.pizza.PepperoniPizza;

public class NYPepperoniPizza extends PepperoniPizza{
    public NYPepperoniPizza(IngredientFactory ingredientFactory, String regionName) {
        super(ingredientFactory, regionName);
    }
}
