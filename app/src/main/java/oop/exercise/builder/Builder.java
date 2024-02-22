package oop.exercise.builder;

import java.util.List;

public class Builder {
    private String name;
    private List<String> likedFoods;
    private List<String> dislikedFoods;

    public Builder() {
    }

    public Builder name(String name){
        this.name = name;
        return this;
    }

    public Builder likedFoods(List<String> likedFoods){
        this.likedFoods = likedFoods;
        return this;
    }

    public Builder dislikedFoods(List<String> dislikedFoods){
        this.dislikedFoods = dislikedFoods;
        return this;
    }

    public Crew build() {
        return new Crew(name, likedFoods, dislikedFoods);
    }
}
