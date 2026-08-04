package practice_5.aquarium;

public class Shark extends Creature {

    public Shark() {
        super("Акула", "плавает быстро и агрессивно");
    }


    @Override
    void demoBehaviour() {
        System.out.println("Акула плавает быстро и агрессивно");
    }
}
