package com.csci5448.zoo.animals;

public class Rhino extends Pachyderm{

    public Rhino(){super();}

    // Override superclass Pachyderm's makeNoise method
    @Override
    public void makeNoise() {
        System.out.println(String.format("%s the %s chuffed.",this.getName(), this.getClass().getSimpleName()));
    }
}
