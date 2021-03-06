package com.csci5448.zoo.animals;

import com.csci5448.zoo.behaviors.NormalExercise;
import com.csci5448.zoo.behaviors.PachydermExercise;

import java.util.Random;

public class Pachyderm extends Animal{

    public Pachyderm(){
        super();
        exerciseBehavior = new PachydermExercise();
    }

    // Override superclass Animal's makeNoise method
    @Override
    public void exercise() {

        Random rand = new Random();
        int decision = rand.nextInt(4);
        if(decision == 0){
            System.out.println(String.format("%s the %s charged.",this.getName(), this.getClass().getSimpleName()));
        } else {
            System.out.println(String.format("%s the %s roamed.", this.getName(), this.getClass().getSimpleName()));
        }
    }


}
