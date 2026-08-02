package _4a_SOLID_LISKOV_Bad;

public class Dog extends Animal {

    void eat(){
        throw new RuntimeException("Dog cannot eat");
    }
}
