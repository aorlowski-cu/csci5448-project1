package com.csci5448.zoo.animals;

import com.csci5448.zoo.behaviors.ExerciseBehavior;
import com.csci5448.zoo.utils.Namer;

public abstract class Animal { //Abstract class example,
    // Strategy Pattern. Delegate Animal exercise behavior
    ExerciseBehavior exerciseBehavior;
    public Animal() {
        String firstLetter = this.getClass().getSimpleName().substring(0,1);
        //Identity example, giving each object a unique name
        this._name = Namer.getNewName(firstLetter);
    }

    public String getName() {
        return _name;
    } //Encapsulation, getter method for private variable

    private String _name; //Encapsulation example, private instance variable for animals
    public boolean sleep(){
        // string format from https://dzone.com/articles/java-string-format-examples
        // get class name from https://stackoverflow.com/questions/6901764/get-concrete-class-name-from-abstract-class
        System.out.println(String.format("%s the %s went to sleep", this._name, this.getClass().getSimpleName()));
        return true;
    }

    public void wake(){
        System.out.println(String.format("%s the %s woke up.",this.getName(), this.getClass().getSimpleName()));
    }
    public void feed(){
        System.out.println(String.format("%s the %s was fed.",this.getName(), this.getClass().getSimpleName()));
    }
    public void exercise(){
        exerciseBehavior.exercise(this.getName(), this.getClass().getSimpleName());
//        System.out.println(String.format("%s the %s roamed.",this.getName(), this.getClass().getSimpleName()));
    }

    //To be overwritten pretty much everywhere
    public void makeNoise(){
        System.out.println(String.format("%s the %s made noise.",this.getName(), this.getClass().getSimpleName()));
    }
}