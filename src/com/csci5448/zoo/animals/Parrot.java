package com.csci5448.zoo.animals;

public class Parrot extends Avian{
    public Parrot(){
        super();
    }

    // Override superclass Avian's makeNoise method
    @Override
    public void makeNoise() {
        System.out.println(String.format("%s the %s squawked.",this.getName(), this.getClass().getSimpleName()));
    }
}
