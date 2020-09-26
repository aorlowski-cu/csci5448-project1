package com.csci5448.zoo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ZooClock  {
    private LocalTime _time;
    private PropertyChangeSupport support;
    private int _day = 0;

    //observer pattern reference https://www.baeldung.com/java-observer-pattern
    public ZooClock (){
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl){
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl){
        support.removePropertyChangeListener(pcl);
    }

    //java LocalTime https://www.javatpoint.com/java-localtime
    public void run(){
        support.firePropertyChange("zooday", this._day, _day + 1);
        _day++;
        for(int i = 0; i < 23; i++){
            LocalTime value = LocalTime.of(i,0,0);
            support.firePropertyChange("zootime", this._time, value);
            this._time = value;
            int hour = this._time.getHour();
            if(hour >= 8 && hour <= 20 ){
                System.out.println(String.format("Time is now %s",
                        this._time.format(DateTimeFormatter.ofPattern("hh:mm a"))));
            }
        }
    }
}
