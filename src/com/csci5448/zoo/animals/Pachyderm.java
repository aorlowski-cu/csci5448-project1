package com.csci5448.zoo.animals;

import java.util.Random;

public class Pachyderm extends Animal{

    public Pachyderm(){ super();}

    @Override
    public void exercise() {

        Random rand = new Random();
        int decision = rand.nextInt(4);
        if(decision == 0){
            System.out.println(String.format("%s the %s charged.",this.getName(), this.getClass().getSimpleName()));
        } else {
            System.out.println(String.format("%s the %s roamed.", this.getName(), this.getClass().getSimpleName()));
        }
    }


}
