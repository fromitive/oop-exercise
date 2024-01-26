package oop.exercise;

import oop.exercise.pizzastore.PizzaStore;
import oop.exercise.pizzastore.PizzaType;
import oop.exercise.pizzastore.pizzafactory.NYPizzaFactory;

public class PizzaStoreClient {
    public static void main(String[] args) {
        PizzaStore store = PizzaStore.from(new NYPizzaFactory());
        store.orderPizza(PizzaType.CHEEZE);
    }
}
