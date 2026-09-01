package practice_5.aquarium;

public class SystemAquarium {
    private Creature creature;

    public void addCreature(Creature creature) {
        this.creature = creature;
        System.out.println(this.creature + " успешно добавлено в аквариум");
    }

    public void forceCreatureToSwim() {
        if (this.creature instanceof Floating) {
            Floating floatingCreature = (Floating) this.creature;
            floatingCreature.swim();
        } else {
            System.out.println("Ошибка: существо не плавает");
        }
    }

    public void forceCreatureToCrawl() {
        if (this.creature instanceof Crawling) {
            Crawling crawlingCreuture = (Crawling) this.creature;
            crawlingCreuture.crawl();
        } else {
            System.out.println("Ошибка: существо не ползает");
        }

    }

    public void deleteCreature() {
        System.out.println("Существо " + this.creature + " удалено из системы");
        this.creature = null;
    }

}
