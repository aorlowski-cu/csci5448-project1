package com.csci5448.zoo.animals;

import com.csci5448.zoo.utils.Namer;

public abstract class Animal {
    public Animal() {
        String firstLetter = this.getClass().getSimpleName().substring(0,1);
        this._name = Namer.getNewName(firstLetter);
    }

    public String getName() {
        return _name;
    }

    private String _name;
    public boolean sleep(){
        // string format from https://dzone.com/articles/java-string-format-examples
        // get class name from https://stackoverflow.com/questions/6901764/get-concrete-class-name-from-abstract-class
        System.out.println(String.format("The %s went to sleep", this.getClass().getSimpleName()));
        //TODO: is there a scenario where the animal doesn't sleep?
        return true;
    }

    public void wake(){
        System.out.println(String.format("%s the %s woke up.",this.getName(), this.getClass().getSimpleName()));
    }
    public void feed(){
        System.out.println(String.format("%s the %s was fed.",this.getName(), this.getClass().getSimpleName()));
    }
    public void exercise(){
        System.out.println(String.format("%s the %s roamed.",this.getName(), this.getClass().getSimpleName()));
    }
}