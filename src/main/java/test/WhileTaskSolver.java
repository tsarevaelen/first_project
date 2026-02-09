package test;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
        //проверка метода по распечатки всех числел от 1 до 10
        // printAllNumberBefore10();

        //проверка команды, пока не встретим exit

        // commandReader();



        System.out.println(sumOfDigits(123));
        System.out.println(sumOfDigits(1011));
    }

    public static void printAllNumberBefore10() {
        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void commandReader() {
        Scanner scanner = new Scanner(System.in);

        String command = "";
        while (!command.equals("exit")) {
            command = scanner.nextLine();
        }
        System.out.println("Программа завершена");
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
