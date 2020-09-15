package com.csci5448.zoo.animals;

import java.util.Random;

public class Canine extends Animal{
    public Canine(){
        super();
    }

    // Override superclass Animal's sleep method
    @Override
    public boolean sleep() {
        super.sleep();
        return true;
    }
}
