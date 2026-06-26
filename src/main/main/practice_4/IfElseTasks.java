package practice_4;

import java.util.Scanner;

public class IfElseTasks {
    public static void main(String[] args) {
        // System.out.println(chekParity());

        // System.out.println(numberMax());

        // System.out.println(descriptionGrade());

        // System.out.println(chekParity1(2));

//        System.out.println(chekSale(16));
//        System.out.println(chekSale(20));
//        System.out.println(chekSale(65));
//        System.out.println(chekSale(70));

        System.out.println(chekGrade(95));
        System.out.println(chekGrade(78));
        System.out.println(chekGrade(67));
        System.out.println(chekGrade(30));


    }

    public static String chekParity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        String parity = "";


        if (number > 0) {
            parity = "Число положительное";
        }
        else if (number < 0) {
            parity = "Число отрицательное";
        }
        else {
            parity = "Число равно нулю";
        }
        return parity;
    }

    public static int numberMax(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число 1: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите число 2: ");
        int number2 = scanner.nextInt();

        int max;

        if (number1 > number2) {
            max = number1;
        }
        else {
            max = number2;
        }

        return max;
    }

    public static String descriptionGrade(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите оценку: ");
        int grade = scanner.nextInt();
        String description = "";

        switch(grade){
            case 5:
                description = "Отлично";
                break;

            case 4:
                description = "Хорошо";
                break;

            case 3:
                description = "Удовлетворительно";
                break;
            default:
                description = "Неудовлетворительно";
        }
        return description;
    }

    public static String chekParity1(int number){
        String parity1 = "Нечетное";
        if (number % 2 == 0){
            parity1 = "Четное";
        }
        return parity1;
    }

    public static String chekSale(int age){
        String sale = "без скидки";

        if (age < 18){
            sale = "скидка 25%";
        }
        if(age >= 65){
            sale = "скидка 30%";
        }
        return sale;
    }

    public static String chekGrade(int number){
        String grade = "";
        if(number >= 90){
            grade = "Отлично";
        }
        else if(number <= 89 & number >=75){
            grade = "Хорошо";
        }
        else if (number <=74 & number >= 60) {
            grade = "Удовлетворительно";
        }
        else{
            grade = "Неудовлетворительно";
        }

        return grade;
    }

}
