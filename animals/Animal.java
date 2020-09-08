package animals;

public abstract class Animal{
    public boolean sleep(){
        // string format from https://dzone.com/articles/java-string-format-examples
        // get class name from https://stackoverflow.com/questions/6901764/get-concrete-class-name-from-abstract-class
        System.out.println(String.format("The %s went to sleep", this.getClass().getSimpleName()));
        //TODO: is there a scenario where the animal doesn't sleep?
        return true;
    }
}