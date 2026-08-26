package practice_5.pets;

public class Cat extends Pet {

    @Override
    void makeEat() {
        System.out.println("Ест влажный корм");
    }

    @Override
    void makeMove() {
        System.out.println("Играет");

    }
}
