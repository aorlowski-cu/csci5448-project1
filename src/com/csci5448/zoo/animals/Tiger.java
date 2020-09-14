package com.csci5448.zoo.animals;

public class Tiger extends Feline{
    public Tiger(){
        super();
    }

    @Override
    public void makeNoise() {
        System.out.println(String.format("%s the %s hissed.",this.getName(), this.getClass().getSimpleName()));
    }
}
