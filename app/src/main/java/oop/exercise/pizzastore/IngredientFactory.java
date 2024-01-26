package oop.exercise.pizzastore;

import oop.exercise.pizzastore.ingredient.Cheeze;
import oop.exercise.pizzastore.ingredient.Dough;
import oop.exercise.pizzastore.ingredient.Pepperoni;
import oop.exercise.pizzastore.ingredient.Sauce;

public interface IngredientFactory {

    Dough createDauth();

    Sauce createSauce();

    Cheeze createCheeze();

    Pepperoni createPepperoni();
}
