package com.csci5448.zoo.animals;

public class Panther extends Feline {

    public Panther(){
        super();
    }

    // Override superclass Feline's makeNoise method
    @Override
    public void makeNoise() {
        System.out.println(String.format("%s the %s growled.",this.getName(), this.getClass().getSimpleName()));
    }
}