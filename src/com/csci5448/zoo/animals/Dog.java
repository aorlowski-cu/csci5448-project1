package com.csci5448.zoo.animals;

public class Dog extends Canine{
    public Dog(){
        super();
    }

    @Override
    public void makeNoise() {
        System.out.println(String.format("%s the %s barked.",this.getName(), this.getClass().getSimpleName()));
    }
}