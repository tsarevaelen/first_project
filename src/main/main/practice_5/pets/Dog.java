package practice_5.pets;

public class Dog extends Pet {

    @Override
    void makeEat() {
        System.out.println("Ест сухой корм");
    }

    @Override
    void makeMove() {
        System.out.println("Гуляет");

    }
}//4. создаю наследников ключевым словом extends



