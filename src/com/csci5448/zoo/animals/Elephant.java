package com.csci5448.zoo.animals;

public class Elephant extends Pachyderm{

    public Elephant(){super();}

    @Override
    public void makeNoise() {
        System.out.println(String.format("%s the %s trumpeted.",this.getName(), this.getClass().getSimpleName()));
    }

    @Override
    public void feed() {
        System.out.println(String.format("%s the %s slowly ate.",this.getName(), this.getClass().getSimpleName()));
    }
}
