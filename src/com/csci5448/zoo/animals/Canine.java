package com.csci5448.zoo.animals;

import java.util.Random;

public class Canine extends Animal{
    public Canine(){
        super();
    }

    // Override superclass Animal's exercise method
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

    // Override superclass Animal's sleep method
    @Override
    public boolean sleep() {
        super.sleep();
        return true;
    }
}
