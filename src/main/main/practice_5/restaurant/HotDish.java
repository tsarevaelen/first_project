package practice_5.restaurant;

public class HotDish extends Dish {// 5. создаю новый класс "Горячее блюдо"
    private int temperature; //7. добавляю поле

    public HotDish(String name, int price, int temp) {//6. автоматически генерирую конструктор
        super(name, price);
        this.temperature = temp;//8. добавляю температуру в конструктор и аргументы
    }

    public int getTemperature() {//12. добавляю геттер, чтобу у блюд был доступ к температуре
        return temperature;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Температура блюда: " + this.temperature + " градусов");
        //19. прописываем то
        //что надо распечатать и перехожим к напиткам
    }
}
