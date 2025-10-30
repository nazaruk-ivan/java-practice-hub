import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        //inheritance - one class inherits the attributes and methods
        //from another class

        Dog dog = new Dog();
        Cat cat = new Cat();

        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive + "\n");

        dog.eat();
        cat.eat();

        System.out.println(cat.lives);
        System.out.println(dog.lives);

        dog.speak();
        cat.speak();

        System.out.println(plant.isAlive);
        plant.photosynthesize();


    }
}