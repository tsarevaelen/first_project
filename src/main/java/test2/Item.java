package test2;

public class Item implements Printable {//1. создаю неабстрактный класс Item
    //18.добавляю "implements Printable", чтобы заставитбь работать с интерфейсом
    //19. после появление ошибки - нажимаю имплементировать метод принт(строка 34)
    private String name;
    private double price;// 2. сразу добавляю неизменяемые поля
    private int count;

    public Item(String name, double price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }// 4. создаю конструктор айтем(можно сгенерить)



    public String getName() { // 3. генерирую геттеры для всех полей
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) { // генерирую сеттер для каунт потому что оно изменяемо
        this.count = count;
    }

    @Override
    public void print() {
        System.out.println("Мой товар: "  +
                this.name + ", цена: " + this.price +
                ", количество на складе: " + this.count);

    }//20. пропсываем то, что нужно распечатать и переходим к электроннике и одежде
}
