package com.csci5448.zoo.animals;

import java.util.Random;

public class Dog extends Canine{
    public Dog(){
        super();
    }

    // Override superclass Canine's exercise method
    @Override
    public void exercise() {

        Random rand = new Random();
        int decision = rand.nextInt(4);
        if(decision == 0){
            System.out.println(String.format("%s the %s dug.",this.getName(), this.getClass().getSimpleName()));
        } else {
            System.out.println(String.format("%s the %s roamed.", this.getName(), this.getClass().getSimpleName()));
        }
    }
    // Override superclass Canine's makeNoise method
    @Override
    public void makeNoise() {
        System.out.println(String.format("%s the %s barked.",this.getName(), this.getClass().getSimpleName()));
    }
}