package com.csci5448.zoo.animals;

public class Wolf extends Canine{
    public Wolf(){super();}

    // Override superclass Canine's makeNoise method
    public void makeNoise() {
        System.out.println(String.format("%s the %s howled.",this.getName(), this.getClass().getSimpleName()));
    }
}
