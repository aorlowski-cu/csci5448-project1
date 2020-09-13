package com.csci5448.zoo.employees;

import com.csci5448.zoo.Zoo;
import com.csci5448.zoo.animals.Animal;

public class Zookeeper extends ZooEmployee {
    public void wakeAnimals() {
        for (Animal animal : Zoo.animals) {
            animal.wake();
        }
    }

    public void feedAnimals() {
        for (Animal animal : Zoo.animals) {
            animal.feed();
        }
    }

    public void exerciseAnimals() {
        for (Animal animal : Zoo.animals) {
            animal.exercise();
        }
    }

    public void rollCallAnimals(){
        for (Animal animal : Zoo.animals) {
            System.out.println(String.format("%s the %s is here.", animal.getName(), animal.getClass()));
        }
    }

    public void sleepAnimals(){
        for(Animal animal: Zoo.animals){
            animal.sleep();
        }
    }
}
