package practice_5.restaurant;

public class HotDish extends Dish{
    private int temp;

    public int getTemp() {
        return temp;
    }

    public HotDish(int temp) {
        this.temp = temp;
    }

    @Override
    void description() {
        System.out.println("Температура блюда: " + this.temp);
    }
}
