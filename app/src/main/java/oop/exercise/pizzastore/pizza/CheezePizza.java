package oop.exercise.pizzastore.pizza;

import oop.exercise.pizzastore.IngredientFactory;
import oop.exercise.pizzastore.Pizza;
import oop.exercise.pizzastore.ingredient.Cheeze;
import oop.exercise.pizzastore.ingredient.Dough;
import oop.exercise.pizzastore.ingredient.Sauce;

public abstract class CheezePizza extends Pizza {
    Dough dough;
    Sauce sauce;
    Cheeze cheeze;

    protected CheezePizza(IngredientFactory ingredientFactory, String regionName) {
        super(ingredientFactory, regionName);
    }

    @Override
    public void prepare() {
        System.out.println("%s 치즈 피자 준비중".formatted(regionName));
        dough = ingredientFactory.createDauth();
        sauce = ingredientFactory.createSauce();
        cheeze = ingredientFactory.createCheeze();
    }
}
