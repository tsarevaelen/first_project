package practice_5;

public class Elephant extends Animal{ //3. создаем наследников
    public Elephant(){
        super("Слон", 2);
    }

    @Override
    void add() {
        System.out.println("Слон добавлен в зоопарк");
    }
}
