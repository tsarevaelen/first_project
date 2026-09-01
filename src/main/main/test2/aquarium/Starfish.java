package test2.aquarium;

public class Starfish extends Creature {
    public Starfish(String species, String move) {
        super("Морская звезда", "медленно ползает");
    }

    @Override
    void demoBehaviour() {
        System.out.println("Морская звезда медленно ползает");

    }
}
