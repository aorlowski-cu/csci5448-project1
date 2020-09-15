package com.csci5448.zoo.animals;

public class Lion extends Feline{
    public Lion(){
        super();
    }

    // Override superclass Feline's makeNoise method
    @Override
    public void makeNoise() {
        System.out.println(String.format("%s the %s purred.",this.getName(), this.getClass().getSimpleName()));
    }
}
