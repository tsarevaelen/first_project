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
        int sum = 0;




        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            int a = scanner.nextInt();
            if (a<0){
                break;
            }
            sum = sum + a;
        }

        System.out.println("Сумма чисел = " + sum);

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

