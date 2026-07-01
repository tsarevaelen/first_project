package practice_5.zoo;

public class Elephant extends Animal { //3. создаем наследников
    public Elephant(){//4.создаем дефолтный конструктор(без аргументов)
        super("Слон", 2);//12. передаем внутренние поля, заданные через конструктор
    }

    @Override//6. автоматически появилась конструкцичя(тело метода)
    public String makeSound() {
        return "трубит";//7.
    }

    @Override
    public String move() {
        return "ходит";//7. Распечатываем метод move

    }
}
