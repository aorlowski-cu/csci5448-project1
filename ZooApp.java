import animals.Cat;
import animals.Dog;

public class ZooApp {
    public static void main(String[] args){
        System.out.println("hello world!");
        Cat cat = new Cat();
        cat.sleep();
        Dog dog = new Dog();
        dog.sleep();
    }
}