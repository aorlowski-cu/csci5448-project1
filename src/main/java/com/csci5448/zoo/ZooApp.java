package com.csci5448.zoo;

import com.csci5448.zoo.employees.Zookeeper;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

public class ZooApp {
    // http://args4j.kohsuke.org/
    @Option(name="-day", usage="Number of Days to run")
    private int numOfDay = 7;

    public void doMain(String[] args) throws CmdLineException{
        CmdLineParser parser = new CmdLineParser(this);
        parser.parseArgument(args);
        Zoo.initZoo();
        Zookeeper keeper = new Zookeeper();

        for(int i = 1; i <= numOfDay; i++) {
            keeper.arrive(i);
            keeper.wakeAnimals();
            keeper.rollCallAnimals();
            keeper.feedAnimals();
            keeper.exerciseAnimals();
            keeper.sleepAnimals();
        }

    }

    public static void main(String[] args) throws Exception{
        new ZooApp().doMain(args);
    }
}
