package com.csci5448.zoo.employees;

import com.csci5448.zoo.utils.Namer;

public abstract class ZooEmployee {

    public ZooEmployee() {
        String firstLetter = this.getClass().getSimpleName().substring(0,1);
        this._name = Namer.getNewName(firstLetter);
    }

    public String getName() {
        return _name;
    }

    private String _name;

    public void arrive(int day){
        System.out.println(String.format("The %s, %s arrived at the zoo on Day %d.", this.getClass().getSimpleName(),this.getName(), day));
    }

    public void depart(){
        System.out.println(String.format("The %s, %s departed the zoo.", this.getClass().getSimpleName(),this.getName()));
    }


}
