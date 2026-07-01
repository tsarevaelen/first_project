package practice_5;

public class Elephant extends Animal{ //3. создаем наследников
    public Elephant(){//4.создаем дефолтный конструктор(без аргументов)
        super("Слон", 2);
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
