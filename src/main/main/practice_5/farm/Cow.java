package practice_5.farm;

public class Cow extends Animal{

    @Override
    void need() {
        System.out.println("Нуждается в выпасе");
    }

    @Override
    void function() {
        System.out.println("Даёт молоко");

    }
}
