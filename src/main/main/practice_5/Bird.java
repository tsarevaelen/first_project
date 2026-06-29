package practice_5;

public class Bird extends Animal {
    public Bird(){
        super("Птица", 1);
    }

    @Override
    void makesounds() {
        System.out.println("Птица чирикает");
    }

    @Override
    void move() {
        System.out.println("Птица летает");

    }
}
