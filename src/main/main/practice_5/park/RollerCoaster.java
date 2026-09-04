package practice_5.park;

public class RollerCoaster extends Attraction{

    @Override
    void sensations() {
        System.out.println("Острые ощущения");
    }

    @Override
    void service() {
        System.out.println("обслуживание: проверка безопасности");

    }
}
