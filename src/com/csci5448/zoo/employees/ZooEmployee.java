package com.csci5448.zoo.employees;

public abstract class ZooEmployee {
    public void arrive(int day){
        System.out.println(String.format("The %s arrived at the zoo on Day %d.", this.getClass().getSimpleName(), day));
    }

    public void depart(){
        System.out.println(String.format("The %s departed the zoo.", this.getClass().getSimpleName()));
    }
}
