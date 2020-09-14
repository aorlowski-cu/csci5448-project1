package com.csci5448.zoo.animals;

public class Owl extends Avian{
    public Owl(){
        super();
    }

    @Override
    public void makeNoise() {
        System.out.println(String.format("%s the %s hooted",this.getName(), this.getClass().getSimpleName()));
    }
}
