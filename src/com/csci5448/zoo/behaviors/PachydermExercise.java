package com.csci5448.zoo.behaviors;

import java.util.Random;

public class PachydermExercise implements ExerciseBehavior{ // Strategy Pattern
    @Override
    public void exercise(String name, String animalType) {
        Random rand = new Random();
        int decision = rand.nextInt(4);
        if(decision == 0){
            System.out.println(String.format("%s the %s charged.", name, animalType));
        } else {
            System.out.println(String.format("%s the %s roamed.", name, animalType));
        }
    }
}
