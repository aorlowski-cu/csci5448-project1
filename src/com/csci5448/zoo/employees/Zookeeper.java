package com.csci5448.zoo.employees;

import com.csci5448.zoo.Zoo;
import com.csci5448.zoo.animals.Animal;

public class Zookeeper extends ZooEmployee {
    public void wakeAnimals() {
        // using polymorphism to call animal's function no matter what kind of animal
        for (Animal animal : Zoo.animals) {
            animal.wake();
        }
    }

    public void feedAnimals() {
        // using polymorphism to call animal's function no matter what kind of animal
        for (Animal animal : Zoo.animals) {
            animal.feed();
        }
    }

    public void exerciseAnimals() {
        // using polymorphism to call animal's function no matter what kind of animal
        for (Animal animal : Zoo.animals) {
            animal.exercise();
        }
    }

    public void rollCallAnimals(){
        // using polymorphism to call animal's function no matter what kind of animal
        for (Animal animal : Zoo.animals) {
            System.out.println(String.format("%s the %s is here.", animal.getName(), animal.getClass().getSimpleName()));
        }
    }

    public void sleepAnimals(){
        // using polymorphism to call animal's function no matter what kind of animal
        for(Animal animal: Zoo.animals){
            animal.sleep();
        }
    }
}
