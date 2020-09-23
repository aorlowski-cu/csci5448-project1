package com.csci5448.zoo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ZooClock  {
    private LocalTime time;
    private PropertyChangeSupport support;

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
        for(int i = 0; i < 23; i++){
            LocalTime value = LocalTime.of(i,0,0);
            support.firePropertyChange("zootime", this.time, value);
            this.time = value;
            int hour = this.time.getHour();
            if(hour >= 8 && hour <= 20 ){
                System.out.println(String.format("Time is now %s",
                        this.time.format(DateTimeFormatter.ofPattern("hh:mm a"))));
            }
        }
    }
}
