package oop.exercise.pizzastore;

public abstract class Pizza {
    protected IngredientFactory ingredientFactory;
    protected String regionName;

    protected Pizza(IngredientFactory ingredientFactory, String regionName) {
        this.ingredientFactory = ingredientFactory;
        this.regionName = regionName;
    }

    public final void bake() {
        System.err.println("175도에서 25분간 굽기");
    }

    public final void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    public final void box() {
        System.err.println("상자에 피자 담기");
    }

    abstract public void prepare();
}
