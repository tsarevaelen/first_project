package practice_5.restaurant;

public class Drink extends Dish{
    private  int volume;

    public int getVolume() {
        return volume;
    }

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    void description() {
        System.out.println("Объем напитка: " + this.volume);
    }
}
