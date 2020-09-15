package com.csci5448.zoo;

import com.csci5448.zoo.animals.Animal;
import com.csci5448.zoo.employees.ZooEmployee;
import com.csci5448.zoo.employees.Zookeeper;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class ZooApp {

    public static void main(String[] args) throws IOException {

        // setting numOfDay as a period of 7
        int numOfDay = 7;

        Zoo.initZoo();

        Zookeeper keeper = new Zookeeper();

        // https://www.tutorialspoint.com/redirecting-system-out-println-output-to-a-file-in-java#:~:text=Instantiate%20a%20PrintStream%20class%20by,created%20in%20the%20first%20step.
        // Direct output stream to file 'out.txt'
        File file = new File("out.txt");
        PrintStream stream = new PrintStream(file);
        System.setOut(stream);

        // main Zookeeper routine
        // loop through days one by one
        for (int i = 1; i <= numOfDay; i++) {
            keeper.arrive(i);
            keeper.wakeAnimals();
            keeper.rollCallAnimals();
            keeper.exerciseAnimals();
            keeper.feedAnimals();
            keeper.sleepAnimals();
            keeper.depart();
        }
    }
}
