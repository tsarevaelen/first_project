package practice_5.park;

public class Carousel extends Attraction{
    @Override
    void sensations() {
        System.out.println("спокойные ощущения");
    }

    @Override
    void service() {
        System.out.println("обслуживание: техническое обслуживание");

    }
}
