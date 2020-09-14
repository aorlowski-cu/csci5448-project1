package com.csci5448.zoo.animals;

public class Wolf extends Canine{
    public Wolf(){super();}

    public void makeNoise() {
        System.out.println(String.format("%s the %s howled.",this.getName(), this.getClass().getSimpleName()));
    }
}
