package practice_2;

public class Main {
    static void main(String[] args) {
        //проверка конструктора по умолчанию
//        Student petya = new Student();
        //когда мы написали свой конструктор - тот, что на 6ст не работает.
        // его нужно вдоизменить >> вписать аргументы
        Student petya = new Student(18, "Петя");

//        System.out.println("Возраст Пети: " + petya.age);
//        System.out.println("Имя:" + petya.name);
        // чтобы не повторять одно и тоже - мы создали метод по распечатываению.
        //чтобы он работал надо написать:
        petya.print();

        Student kolya = new Student(20, "Коля");


//        System.out.println("Возраст Коли: " + kolya.age);
//        System.out.println("Имя:" + kolya.name);
        // чтобы не повторять одно и тоже - мы создали метод по распечатываению.
        //чтобы он работал надо написать:
        kolya.print();

        petya.setName("Антон");
        //System.out.println("Новое имя Пети: " + petya.name);
        petya.print();

        kolya.setAge(21);
        //System.out.println("Новый возраст Коли: " + kolya.age);
        kolya.print();


    }
}
