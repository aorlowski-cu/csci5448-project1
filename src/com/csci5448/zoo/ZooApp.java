package com.csci5448.zoo;

import com.csci5448.zoo.employees.ZooAnnouncer;
import com.csci5448.zoo.employees.ZooFoodServer;
import com.csci5448.zoo.employees.Zookeeper;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ZooApp {

    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        // setting numOfDay as a period of 7
        System.out.println("How many days do you want to run the program for?");
        int numOfDay = s.nextInt();
        s.close();
        Zoo.initZoo();

        Zookeeper keeper = new Zookeeper();
        ZooAnnouncer announcer = new ZooAnnouncer();
        ZooFoodServer foodServer = new ZooFoodServer();

        //Zoo announcer watches the keeper
        keeper.addPropertyChangeListener(announcer);
        foodServer.addPropertyChangeListener(announcer);

        ZooClock clock = new ZooClock();

        //Zoo keeper watches the clock
        clock.addPropertyChangeListener(keeper);
        clock.addPropertyChangeListener(announcer);
        clock.addPropertyChangeListener(foodServer);

        // https://www.tutorialspoint.com/redirecting-system-out-println-output-to-a-file-in-java#:~:text=Instantiate%20a%20PrintStream%20class%20by,created%20in%20the%20first%20step.
        // Direct output stream to file 'out.txt'
        File file = new File("dayatthezoo.out");
        PrintStream stream = new PrintStream(file);
        System.setOut(stream);

        // main Zookeeper routine
        // loop through days one by one
        for (int i = 1; i <= numOfDay; i++) {
            System.out.println("Day " + i);
            clock.run();
            System.out.println("#########################");
            System.out.println("#########################");
        }
    }
}
