package com.csci5448.zoo.animals;

public class Hippo extends Pachyderm{

    public Hippo(){super();}

    // Override superclass Pachyderm's makeNoise method
    @Override
    public void makeNoise() {
        System.out.println(String.format("%s the %s grunted.",this.getName(), this.getClass().getSimpleName()));
    }
}
