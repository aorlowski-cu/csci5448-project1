package com.csci5448.zoo.employees;

import com.csci5448.zoo.Zoo;
import com.csci5448.zoo.animals.Animal;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.time.LocalTime;

public class Zookeeper extends ZooEmployee implements PropertyChangeListener {

    private PropertyChangeSupport zooEmpObservable;
    private String toBeObserved;

    //Adding an observable to each ZooKeeper, this code and next three methods from:
    // https://www.baeldung.com/java-observer-pattern
    public Zookeeper(){
        super();
        //Allows it to be an observable
        zooEmpObservable = new PropertyChangeSupport(this);
    }
    //Part of the observer pattern
    public void addPropertyChangeListener(PropertyChangeListener pcl) {zooEmpObservable.addPropertyChangeListener(pcl); }
    public void removePropertyChangeListener(PropertyChangeListener pcl) { zooEmpObservable.removePropertyChangeListener(pcl); }

    //This method is part of the Observer pattern, allows the ZooKeeper to show the Announcer what it is going to do
    public void setJob(String value) {
        zooEmpObservable.firePropertyChange("news", this.toBeObserved, value);
        this.toBeObserved = value;
    }

    public void propertyChange(PropertyChangeEvent e){
        this._maybeDoZooTask((LocalTime)e.getNewValue());
    }

    private void _maybeDoZooTask(LocalTime time){
        switch(time.getHour()) {
            case 10:
                wakeAnimals();
                rollCallAnimals();
                break;
            case 14:
                feedAnimals();
                break;
            case 17:
                exerciseAnimals();
                break;
            case 20:
                sleepAnimals();
                break;
            default:
                break;
        }

    }

    public void wakeAnimals() {
        //Sending the wake message to the ZooAnnouncer, part of the Observer pattern
        this.setJob("Wake");
        // using polymorphism to call animal's function no matter what kind of animal
        for (Animal animal : Zoo.animals) {
            animal.wake();
        }
    }

    public void feedAnimals() {
        //Sending the feed message to the ZooAnnouncer, part of the Observer pattern
        this.setJob("Feed");
        // using polymorphism to call animal's function no matter what kind of animal
        for (Animal animal : Zoo.animals) {
            animal.feed();
        }
    }

    public void exerciseAnimals() {
        //Sending the exercise message to the ZooAnnouncer, part of the Observer pattern
        this.setJob("Exercise");
        // using polymorphism to call animal's function no matter what kind of animal
        for (Animal animal : Zoo.animals) {
            animal.exercise();
        }
    }

    public void rollCallAnimals(){
        //Sending the rollCall message to the ZooAnnouncer, part of the Observer pattern
        this.setJob("rollCall");
        // using polymorphism to call animal's function no matter what kind of animal
        for (Animal animal : Zoo.animals) {
            System.out.println(String.format("%s the %s is here.", animal.getName(), animal.getClass().getSimpleName()));
        }
    }

    public void sleepAnimals(){
        //Sending the sleep message to the ZooAnnouncer, part of the Observer pattern
        this.setJob("Sleep");
        // using polymorphism to call animal's function no matter what kind of animal
        for(Animal animal: Zoo.animals){
            animal.sleep();
        }
    }

}
