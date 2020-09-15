package com.csci5448.zoo.animals;

public class Cat extends Feline {
    public Cat(){
        super();
    }

    // Override superclass Feline's makeNoise method
    @Override
    public void makeNoise() {
        System.out.println(String.format("%s the %s meowed.",this.getName(), this.getClass().getSimpleName()));
    }


}