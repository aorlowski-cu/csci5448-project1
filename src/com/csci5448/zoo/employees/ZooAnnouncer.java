package com.csci5448.zoo.employees;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ZooAnnouncer extends ZooEmployee implements PropertyChangeListener {

    private String job;

    //Observer pattern, ZooAnnouncer is the Observer of ZooKeeper
    // Ran into an issue here where the parent class listens for clock changes
    // but this class listens for Zookeeper changes. Had to add a check for event
    // name. Bad part of events is that it was a runtime exception rather than
    // compile time.
    public void propertyChange(PropertyChangeEvent evt) {
        super.propertyChange(evt);
        if (evt.getPropertyName() == "keeperactivity") {
            this.setJob((String) evt.getNewValue());
        }
        else if (evt.getPropertyName() == "foodactivity"){
            this._makeAnnouncement("The food server just served " + (String) evt.getNewValue());
        }
    }

    public void maybeDoScheduledActivity(int hour) {
        switch (hour) {
            case 9:
                arrive();
                break;
            case 21:
                depart();
                break;
            default:
                break;
        }
    }

    //setJob allows the observable to send in what message to be displayed
    private void setJob(String s) {
        switch (s) {
            case "Wake":
                _makeAnnouncement("The Zookeeper is about to wake the animals!");
                break;
            case "Sleep":
                _makeAnnouncement("The Zookeeper is about to put the animals to sleep!");
                break;
            case "rollCall":
                _makeAnnouncement("The Zookeeper is about to perform a roll call on the animals!");
                break;
            case "Exercise":
                _makeAnnouncement("The Zookeeper is about to make the animals exercise!");
                break;
            case "Feed":
                _makeAnnouncement("The Zookeeper is about to feed the animals!");
                break;
            default:
                break;
        }
    }

    private void _makeAnnouncement(String message){
        System.out.println("Hi, this is the Zoo Announcer. " + message);
    }
}
