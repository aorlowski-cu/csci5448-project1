# csci5448-project1
## Project Team Name: BeastKeeper
## Team Members: Alex Orlowski, Andy Fan, Lincoln Schafer
## Overview
1. Developed on jdk version 11
2. IDE: IntelliJ

## Output
Output all the process to file "out.txt"

## Project Structure
Our project can be split into several components (within different package)
1. /employees:
    1. ZooEmployee - Abstract class for all zoo employees
    2. Zookeeper - Actual zoo keeper class which inherit `ZooEmployee`

2. /animals:
    Animal - Abstract class that generate basic functionality for all the animals
                (method includes: sleep(), wake(), feed(), exercise(), makeNoise())
    
    Under Animal, we created a few animal groups including Avian, Canine, Feline...
    The actualy animal that we are using will then inherit the animal group. 
    Ex: Dog will be subclass of Canine
3. /utils:
    1. Namer - Utility function that helps us auto generate Animal names

## To run the application:
1. Use IntelliJ to import the project.
2. Run `ZooApp`

## Issues:
1. At first, we tried to use Maven as a plugin to install third-party libraries. However, the default java version
is not set to the one we are using (jdk 11), it took us sometime to figure out the correct Maven jvm setting, and
how to add new third-party libraries dependency. Later on, since there is not much use cases for third-party 
libraries, we get rid of Maven entirely for simplicity.
