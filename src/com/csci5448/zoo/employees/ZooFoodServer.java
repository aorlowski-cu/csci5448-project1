package com.csci5448.zoo.employees;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ZooFoodServer extends ZooEmployee {

    private PropertyChangeSupport zooServerObservable;
    private String _job;

    //Adding an observable to each ZooFoodServer, this code and next three methods from:
    // https://www.baeldung.com/java-observer-pattern
    public ZooFoodServer(){
        super();
        zooServerObservable = new PropertyChangeSupport(this);
    }
    //Part of the observer pattern
    public void addPropertyChangeListener(PropertyChangeListener pcl) {zooServerObservable.addPropertyChangeListener(pcl); }
    public void removePropertyChangeListener(PropertyChangeListener pcl) { zooServerObservable.removePropertyChangeListener(pcl); }

    public void maybeDoScheduledActivity(int hour){
        switch(hour) {
            case 9:
                arrive();
                break;
            case 12:
            case 17:
                makeFood();
                break;
            case 14:
            case 19:
                clean();
                break;
            case 13:
                serveFood("Lunch");
                break;
            case 18:
                serveFood("Dinner");
                break;
            case 21:
                depart();
                break;
            default:
                break;
        }
    }
    public void makeFood(){
        System.out.println("Food server is making food.");
    }

    public void serveFood(String meal){
        System.out.println("Food server served " + meal);
        zooServerObservable.firePropertyChange("foodactivity", this._job, meal);
    }

    public void clean() {
        System.out.println("Food server cleaned.");
    }
}
