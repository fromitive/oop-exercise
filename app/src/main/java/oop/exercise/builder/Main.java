package oop.exercise.builder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Crew poke = new Builder()
                .name("포케")
                .likedFoods(List.of("피자","회","셀러드","김밥"))
                .dislikedFoods(List.of("자동차","사다리"))
                .build();

        System.out.println(poke);
    }
}
