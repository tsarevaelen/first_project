package practice_4;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){

        taskOneDoWhile();
        taskTwoDoWhile();
        taskThreeDoWhile();
        taskFourDoWhile();
        taskFiveDoWhile();

    }
    public static void taskOneDoWhile(){
        Scanner scanner = new Scanner(System.in);
        int number;

        do{
            System.out.print("Введите число: ");
            number = scanner.nextInt();
        } while (number <= 0);

    }

    public static void taskTwoDoWhile(){
        Scanner scanner = new Scanner(System.in);

        String passwort = "qwert123";

        do{
            System.out.print("Введите пароль: ");
            passwort = scanner.nextLine();
        } while(!passwort.equals("qwert123"));
        System.out.println("Верный пароль");

    }

    public static void taskThreeDoWhile(){
        int i = 1;

        do{
            System.out.println(i);
            i++;

        } while (i <= 10);
    }

    public static void taskFourDoWhile(){
        Scanner scanner = new Scanner(System.in);
        String command = "";
        do{
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
        } while (!command.equals("exit"));{
            System.out.println("Программа завершена!");
        }

    }

    public static void taskFiveDoWhile(){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Введите число для рассчета: ");
        number = scanner.nextInt();

        int count = 0;

        if(number == 0){
            count = 1;
        }

        do{
            number = number / 10;
            count ++;
        } while (number != 0 );

        System.out.println("Количество цифр: " + count);
    }


}
