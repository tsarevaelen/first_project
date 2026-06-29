package practice_5;

public class Bird extends Animal {
    public Bird(){
        super("Птица", 1);
    }

    @Override
    void add() {
        System.out.println("Птица добавлена в зоопарк");
    }
}
