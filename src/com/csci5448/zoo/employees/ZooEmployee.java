package com.csci5448.zoo.employees;

import com.csci5448.zoo.utils.Namer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.LocalTime;

public abstract class ZooEmployee implements PropertyChangeListener{ //Abstract class example, also Abstraction
    public ZooEmployee() {
        String firstLetter = this._className.substring(0,1); //Identity example, giving each object a unique name
        this._name = Namer.getNewName(firstLetter);
    }

    private int _day = 0;

    public void propertyChange(PropertyChangeEvent e){
        if(e.getPropertyName() == "zooday"){
            _day = (int)e.getNewValue();
        }
        else if (e.getPropertyName() == "zootime"){
            LocalTime time = (LocalTime)e.getNewValue();
            maybeDoScheduledActivity(time.getHour());
        }
    }

    // Every zoo employee subclass should implement their activity schedule
    // Another enhancement here would be a class or classes to handle scheduled
    // actions, but that seemed a bit overkill for just 3 subclasses.
    public abstract void maybeDoScheduledActivity (int hour);

    public String getName() {
        return _name;
    }//Encapsulation example

    private String _name; //encapsulation example
    private String _className = this.getClass().getSimpleName();

    public void arrive(){
        System.out.println(String.format("The %s, %s arrived at the zoo on Day %d.", this._className,this.getName(), _day));
    }

    public void depart(){
        System.out.println(String.format("The %s, %s departed the zoo.", this._className,this.getName()));
    }
}
