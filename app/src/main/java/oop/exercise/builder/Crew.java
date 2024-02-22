package oop.exercise.builder;

import java.util.List;

public class Crew {
    private final String name;
    private final List<String> likedFoods;
    private final List<String> dislikedFoods;

    public Crew(String name, List<String> likedFoods, List<String> dislikedFoods) {
        this.name = name;
        this.likedFoods = likedFoods;
        this.dislikedFoods = dislikedFoods;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "name='" + name + '\'' +
                ", likedFoods=" + likedFoods +
                ", dislikedFoods=" + dislikedFoods +
                '}';
    }
}
