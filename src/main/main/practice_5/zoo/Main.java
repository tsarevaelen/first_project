package practice_5.zoo;

public class Main {//13. создаем класс мейн
    public static void main(String[] args){// 14. сразу точку входа в программу
         //15. создаем животных

        Zoo zoo = new Zoo();// 16. создаем зоопарк

        Animal elephant = new Elephant();
        zoo.addAnimal(elephant); // 17. добавь животного, котого я передала в аргументах
        zoo.forceMakeSound(); //18. выведи поведение этого животного
        zoo.forceMakeMove();
        zoo.removeAnimal();

        Animal calibri = new Bird();
        zoo.addAnimal(calibri);
        zoo.forceMakeSound();
        zoo.forceMakeMove();


    }

}
