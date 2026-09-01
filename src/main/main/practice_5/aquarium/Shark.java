package practice_5.aquarium;

public class Shark extends Creature implements Floating {
    @Override
    public void swim() {
        System.out.println("Акула плавает быстро и агрессивно");
    }
}
