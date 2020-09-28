package com.csci5448.zoo.behaviors;

public class FelineExercise implements ExerciseBehavior{ // Strategy Pattern
    @Override
    public void exercise(String name, String animalType) {
        System.out.println(String.format("%s the %s prowled.", name, animalType));
    }
}
