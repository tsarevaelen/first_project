package practice_5.zoo;

public class Main {//13. создаем класс мейн
    public static void main(String[] args){// 14. сразу точку входа в программу
        Animal elephant = new Elephant(); //15. создаем животных
        Animal bird = new Bird();
        Zoo zoo = new Zoo();// 16. создаем зоопарк

        zoo.addAnimal(elephant); // 17. добавь животного, котого я передала в аргументах
        zoo.demonstrateBehavior(); //18. выведи поведение этого животного


    }

}
