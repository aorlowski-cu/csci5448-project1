package com.csci5448.zoo;

import com.csci5448.zoo.animals.*;

import java.util.ArrayList;

public class Zoo {
    public static final ArrayList<Animal> animals = new ArrayList<>();
    // init the zoo
    public static void initZoo(){
        animals.add(new Cat());
        animals.add(new Panther());
        animals.add(new Hippo());
        animals.add(new Hawk());
        animals.add(new Dog());
        animals.add(new Elephant());
        animals.add(new Owl());
        animals.add(new Wolf());
        animals.add(new Lion());
        animals.add(new Tiger());
        animals.add(new Parrot());
        animals.add(new Rhino());

        /*
        Testing:
         */

    }
}
