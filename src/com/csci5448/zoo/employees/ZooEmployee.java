package com.csci5448.zoo.employees;

public abstract class ZooEmployee {
    public void arrive(){
        System.out.println(String.format("The %s arrived at the zoo.", this.getClass().getSimpleName()));
    }

    public void depart(){
        System.out.println(String.format("The %s departed the zoo.", this.getClass().getSimpleName()));
    }
}
