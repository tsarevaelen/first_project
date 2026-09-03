package practice_5.farm;

public class Chicken extends Animal{

    @Override
    void need() {
        System.out.println("Требует зерно");
    }

    @Override
    void function() {
        System.out.println("Несёт яйца");

    }
}
