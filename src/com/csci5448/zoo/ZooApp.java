package com.csci5448.zoo;

import com.csci5448.zoo.animals.Animal;

public class ZooApp {

    public static void main(String[] args) {
        Zoo.initZoo();
        for(Animal animal: Zoo.animals){
            System.out.println(animal.getName());
        }
    }
}
