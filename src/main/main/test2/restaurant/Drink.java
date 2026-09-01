package test2.restaurant;

public class Drink extends Dish {//9. создаю новый класс напитки
    private int volume;//10. добавляю приватное поле - объем

    public Drink(String name, int price, int vol){
        super(name, price);
        this.volume = vol;
    }

    public int getVolume() {//11. добавляю геттер для объема,
        // чтобы у напиитков был доступ к новому полю.(в гор.блюдах тоже самое делаю)
        return volume;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Объем: " + this.volume + " мл.");
        //20. прописываем то
        //что надо распечатать и перехожим к напиткам

    }
}