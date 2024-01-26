package oop.exercise.pizzastore.pizza;

import oop.exercise.pizzastore.IngredientFactory;
import oop.exercise.pizzastore.Pizza;
import oop.exercise.pizzastore.ingredient.Dough;
import oop.exercise.pizzastore.ingredient.Pepperoni;
import oop.exercise.pizzastore.ingredient.Sauce;

public abstract class PepperoniPizza extends Pizza {
    Dough dough;
    Sauce sauce;
    Pepperoni pepperoni;

    public PepperoniPizza(IngredientFactory ingredientFactory, String regionName) {
        super(ingredientFactory, regionName);
    }

    @Override
    public void prepare() {
        System.out.println("%s 페퍼로니 피자 준비중".formatted(regionName));
        dough = ingredientFactory.createDauth();
        sauce = ingredientFactory.createSauce();
        pepperoni = ingredientFactory.createPepperoni();
    }

}
