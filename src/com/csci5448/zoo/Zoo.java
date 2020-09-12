package com.csci5448.zoo;

import com.csci5448.zoo.animals.Animal;
import com.csci5448.zoo.animals.Cat;
import com.csci5448.zoo.animals.Panther;

import java.util.ArrayList;

public class Zoo {
    public static final ArrayList<Animal> animals = new ArrayList<Animal>();

    // init the zoo
    public static void initZoo(){
        animals.add(new Cat());
        animals.add(new Cat());
        animals.add(new Panther());
    }
}
