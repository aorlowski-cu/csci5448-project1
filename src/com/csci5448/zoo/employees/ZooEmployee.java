package com.csci5448.zoo.employees;

import com.csci5448.zoo.utils.Namer;

public abstract class ZooEmployee { //Abstract class example, also Abstraction

    public ZooEmployee() {
        String firstLetter = this.getClass().getSimpleName().substring(0,1); //Identity example, giving each object a unique name
        this._name = Namer.getNewName(firstLetter);
    }

    public String getName() {
        return _name;
    }//Encapsulation example

    private String _name; //encapsulation example

    public void arrive(int day){
        System.out.println(String.format("The %s, %s arrived at the zoo on Day %d.", this.getClass().getSimpleName(),this.getName(), day));
    }

    public void depart(){
        System.out.println(String.format("The %s, %s departed the zoo.", this.getClass().getSimpleName(),this.getName()));
    }


}
