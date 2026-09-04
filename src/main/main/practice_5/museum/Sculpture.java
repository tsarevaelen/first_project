package practice_5.museum;

public class Sculpture extends Exhibit{
    @Override
    void care() {
        System.out.println("Нуждается в реставрации");
    }

    @Override
    void story() {
        System.out.println("Привезена из Египта 16 века");

    }
}
