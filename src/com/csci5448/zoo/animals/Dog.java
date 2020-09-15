package com.csci5448.zoo.animals;

public class Dog extends Canine{
    public Dog(){
        super();
    }

    // Override superclass Canine's makeNoise method
    @Override
    public void makeNoise() {
        System.out.println(String.format("%s the %s barked.",this.getName(), this.getClass().getSimpleName()));
    }
}