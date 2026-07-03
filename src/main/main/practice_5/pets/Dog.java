package practice_5.pets;

public class Dog extends Pet { //4. создаю наследников ключевым словом extends
    public Dog(){//5. создание дефолтного конструктора без аргументов
        super("ест сухой корм", "гуляет");
    }

    @Override
    public void feed() {
        System.out.println("ест сухой корм");
    }

    @Override
    public void interact() {//7. в появившуюся конструкцию добавила модификатор доступа public
        System.out.println("гуляет");// 8. распечатываю методы

    }
}
