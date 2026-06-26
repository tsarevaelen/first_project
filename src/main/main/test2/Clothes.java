package test2;

public class Clothes extends Item {//10. создаем новый класс одежда
    private final static char DEFAULT_SIZE = 'M'; //13. добавляю дефолтный размер
    private char size;//12. добавляю приватное поле размер


    public Clothes(String name, double price, int count) {
        super(name, price, count); //11. Добавляю конструктор
        this.size = DEFAULT_SIZE; //14. добавляю размер к конструктору
    }

    public char getSize() {//15. добавляю геттер, чтобы у клоуз был достук к сайз
        return size;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(", размер: "  +
                this.size);

    }//22. через слово супер указываем, что нужно распечатать тоже самое и добавляем размер
}
