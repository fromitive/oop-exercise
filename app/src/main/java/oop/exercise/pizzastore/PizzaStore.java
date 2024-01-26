package oop.exercise.pizzastore;

public class PizzaStore {
    PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public static PizzaStore from(PizzaFactory factory) {
        return new PizzaStore(factory);
    }

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = factory.create(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
