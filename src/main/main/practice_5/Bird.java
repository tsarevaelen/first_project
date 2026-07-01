package practice_5;

public class Bird extends Animal {
    public Bird(){
        super("Птица", 1);
    }

    @Override
    public String makeSound() {
        return "чирикает";
    }

    @Override
    public String move() {
        return "летает";

    }
}
