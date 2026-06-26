package test2;

public class Electronics extends Item { //5. создаю новый класс - товар электроникс
    private final static int DEFAULT_GUARANTEE = 2;//8. добавляю дефолтное значение гарантии
    private int guarantee; //7. добавляю приватное поле гарантии

    public Electronics(String name, double price, int count) {
        super(name, price, count);//6. автоматически создаю конструктор
        this.guarantee = DEFAULT_GUARANTEE; //9. добавляю гарантию в конструктор

    }

    public int getGuarantee() {//14. так как у электроникс нет дотсума к гарантии
        return guarantee;//добавляю геттер
    }

    @Override
    public void print() {
        super.print();
        System.out.println(", гарантия: "  + this.guarantee + "года/лет");
    } //21.прописываем через слово супер, что нужно распечатать тоже, что и у айтема,
    // и добавляем гарантию
}
