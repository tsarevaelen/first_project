package practice_5;

public class Elephant extends Animal{ //3. создаем наследников
    public Elephant(){//4.создаем дефолтный конструктор(без аргументов)
        super("Слон", 2);
    }

    @Override
    void makesounds() {
        System.out.println("Слон трубит");//6. автоматически появилась конструкцичя(тело метода)
    }

    @Override
    void move() {
        System.out.println("Слон ходит");

    }
}
