package oop.exercise.pizzastore.pizzafactory;

import oop.exercise.pizzastore.PizzaType;
import oop.exercise.pizzastore.Pizza;
import oop.exercise.pizzastore.pizza.ny.NYCheezePizza;
import oop.exercise.pizzastore.PizzaFactory;
import oop.exercise.pizzastore.IngredientFactory;
import oop.exercise.pizzastore.ingredientfactory.NYIngredientFactory;

public class NYPizzaFactory implements PizzaFactory{
    
    IngredientFactory ingredientFactory = new NYIngredientFactory();
    String regionName = "NEWYORK";
    @Override
    public Pizza create(PizzaType type) {
        if (type == PizzaType.CHEEZE) {
            return new NYCheezePizza(ingredientFactory, regionName);
        }
        throw new IllegalArgumentException("%s pizza does not support.".formatted(type));
    }
    
}
