package com.csci5448.zoo.animals;

public class Hawk extends Avian{
    public Hawk(){
        super();
    }

    // Override superclass Avian's makeNoise method
    @Override
    public void makeNoise() {
        System.out.println(String.format("%s the %s screeched.",this.getName(), this.getClass().getSimpleName()));
    }
}
