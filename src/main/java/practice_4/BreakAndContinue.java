package practice_4;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        taskOneBreakAndContinue();
        taskTwoBreakAndContinue();
        taskThreeBreakAndContinue();
        taskFourBreakAndContinue();

    }

    public static void taskOneBreakAndContinue() {
        int a;
        int b;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Первое число: ");
        a = scanner.nextInt();

        System.out.print("Второе число: ");
        b = scanner.nextInt();

        while (a >= 0 & b >= 0) {
            sum = a + b;
            System.out.println("Сумма чисел = " + sum);
            break;
        }
    }

    public static void taskTwoBreakAndContinue() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void taskThreeBreakAndContinue() {

        int number;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("введите числа:");
            number = scanner.nextInt();

            if (number < 0) {
                continue;
            }
            System.out.println("Вы ввели:" + number);

        } while (number != 0);




        }

        public static void taskFourBreakAndContinue(){
        Scanner scanner = new Scanner(System.in);
        String command = "";


            while (true){
                System.out.print("Введите команду:" );
                command = scanner.nextLine();

                if(command.equals("stop")){
                    break;
                }


            }
            System.out.println("Программа завершена");

        }
    }

