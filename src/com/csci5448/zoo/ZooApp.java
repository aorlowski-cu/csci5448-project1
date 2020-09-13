package com.csci5448.zoo;

import com.csci5448.zoo.animals.Animal;
import com.csci5448.zoo.employees.ZooEmployee;
import com.csci5448.zoo.employees.Zookeeper;

public class ZooApp {

    public static void main(String[] args) {
        Zoo.initZoo();
        for(Animal animal: Zoo.animals){
            System.out.println(animal.getName());
        }
        Zookeeper keeper = new Zookeeper();
        keeper.arrive();
    }
}
