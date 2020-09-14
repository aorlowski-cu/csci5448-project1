package com.csci5448.zoo.animals;

public class Avian extends Animal{
    public Avian(){
        super();
    }

    @Override
    public void wake() {
        System.out.println(String.format("%s the %s woke up and flew away.",this.getName(), this.getClass().getSimpleName()));
    }
}
