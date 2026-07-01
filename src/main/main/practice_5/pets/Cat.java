package practice_5.pets;

public class Cat extends Pet {
    public Cat(){
        super();
    }

    @Override
    void feed() {
        System.out.println("ест влажный корм");
    }

    @Override
    void interact() {
        System.out.println("играет");

    }
}
