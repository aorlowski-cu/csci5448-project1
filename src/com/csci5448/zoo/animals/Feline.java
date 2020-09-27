package com.csci5448.zoo.animals;
import com.csci5448.zoo.behaviors.FelineExercise;
import com.csci5448.zoo.behaviors.NormalExercise;

import java.util.Random;
public class Feline extends Animal {
    public Feline(){
        super();
        exerciseBehavior = new FelineExercise();
    }

    // Override superclass Animal's wake method
    @Override
    public void wake() {
        super.wake();
    }

    // Override superclass Animal's feed method
    @Override
    public void feed() {
        super.feed();
    }
//
//    // Override superclass Animal's exercise method
//    @Override
//    public void exercise() {
//        System.out.println(String.format("%s the %s prowled.",this.getName(), this.getClass().getSimpleName()));
//    }

    // Override superclass Animal's makeNoise method
    @Override
    public void makeNoise(){
        super.makeNoise();
    }

    // Override superclass Animal's sleep method
    @Override
    public boolean sleep() {
        Random rand = new Random();
        int decision = rand.nextInt(10);

        if(decision < 3){
            exercise();
            return false;
        } else if (decision < 6){
            makeNoise();
            return false;
        } else {
            super.sleep();
        }

    return true;
    }
}