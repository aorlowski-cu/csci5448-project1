package com.csci5448.zoo.animals;
import java.util.Random;
public class Feline extends Animal {
    public Feline(){
        super();
    }

    @Override
    public void wake() {
        super.wake();
    }

    @Override
    public void feed() {
        super.feed();
    }

    @Override
    public void exercise() {
        System.out.println(String.format("%s the %s prowled.",this.getName(), this.getClass().getSimpleName()));
    }

    @Override
    public void makeNoise(){
        super.makeNoise();
    }

    public boolean sleep() {
        Random rand = new Random();
        int decision = rand.nextInt(10);

        if(decision < 3){
            exercise();
            return false;
        } else if (decision >2 && decision < 6){
            makeNoise();
            return false;
        } else {
            super.sleep();
        }

    return true;
    }
}