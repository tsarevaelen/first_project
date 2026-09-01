package practice_5.aquarium;

public class Starfish extends Creature implements Crawling {
    @Override
    public void crawl() {
        System.out.println("Морская звезда медленно ползает");
    }
}
