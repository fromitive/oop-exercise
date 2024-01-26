package oop.exercise.pizzastore.ingredient.ingredientfactory;

import oop.exercise.pizzastore.IngredientFactory;
import oop.exercise.pizzastore.ingredient.Cheeze;
import oop.exercise.pizzastore.ingredient.Dough;
import oop.exercise.pizzastore.ingredient.Sauce;
import oop.exercise.pizzastore.ingredient.cheeze.ReggianoCheeze;
import oop.exercise.pizzastore.ingredient.dough.ThinCrustDough;
import oop.exercise.pizzastore.ingredient.sauce.MarinaraSauce;

public class NYIngredientFactory implements IngredientFactory{

    @Override
    public Cheeze createCheeze() {
        System.out.println("ReggianoCheeze 생성");
        return new ReggianoCheeze();
    }

    @Override
    public Dough createDauth() {
        System.out.println("ThinCrustDough 생성");
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        System.out.println("MarinaraSauce 생성");
        return new MarinaraSauce();
    }

}
