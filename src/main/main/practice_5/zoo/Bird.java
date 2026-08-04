package practice_5.zoo;

public class Bird extends Animal {


    @Override
    void makeSound() {
        System.out.println("Чирик");
    }

    @Override
    void move() {
        System.out.println("Летать");

    }
}
