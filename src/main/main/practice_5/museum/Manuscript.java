package practice_5.museum;

public class Manuscript extends Exhibit{

    @Override
    void care() {
        System.out.println("Требует контролируемой влажности");
    }

    @Override
    void story() {
        System.out.println("Найден путем раскопок в Вавилоне");

    }
}
