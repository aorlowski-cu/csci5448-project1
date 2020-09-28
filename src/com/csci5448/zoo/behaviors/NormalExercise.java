package com.csci5448.zoo.behaviors;

public class NormalExercise implements ExerciseBehavior{ // Strategy Pattern
    @Override
    public void exercise(String name, String animalType) {
        System.out.println(String.format("%s the %s roamed.", name, animalType));
    }
}
