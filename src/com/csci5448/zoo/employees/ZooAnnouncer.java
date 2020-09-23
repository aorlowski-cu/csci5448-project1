package com.csci5448.zoo.employees;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ZooAnnouncer extends ZooEmployee implements PropertyChangeListener {

        private String job;

        //Observer pattern, ZooAnnouncer is the Observer of ZooKeeper
        public void propertyChange(PropertyChangeEvent evt) {
            this.setJob((String) evt.getNewValue());
        }
        //setJob allows the observable to send in what message to be displayed
        private void setJob(String s) {
            switch(s) {
                case "Wake":
                    System.out.println("Hi, this is the Zoo Announcer.  The Zookeeper is about to wake the animals!");
                    break;
                case "Sleep":
                    System.out.println("Hi, this is the Zoo Announcer.  The Zookeeper is about to put the animals to sleep!");
                    break;
                case "rollCall":
                    System.out.println("Hi, this is the Zoo Announcer.  The Zookeeper is about to perform a roll call on the animals!");
                    break;
                case "Exercise":
                    System.out.println("Hi, this is the Zoo Announcer.  The Zookeeper is about to make the animals exercise!");
                    break;
                case "Eat":
                    System.out.println("Hi, this is the Zoo Announcer.  The Zookeeper is about to feed the animals!");
                    break;
                default:
                    break;
            }
        }
    }
