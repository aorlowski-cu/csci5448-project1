package com.csci5448.zoo.animals;

import com.csci5448.zoo.behaviors.NormalExercise;

import java.util.Random;

public class Canine extends Animal{
    public Canine(){
        super();
        exerciseBehavior = new NormalExercise();
    }

    // Override superclass Animal's sleep method
    @Override
    public boolean sleep() {
        super.sleep();
        return true;
    }
}
