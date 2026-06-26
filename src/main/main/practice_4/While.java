package practice_4;

import java.util.Scanner;

public class While {
    public static void main(String[] args){
        factorial();
        allEvenNumber();
        countdown();
    }
        public static void factorial(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            int n = scanner.nextInt();


            int result = 1;
            int i = 1;

            while (i <= n){
                result = result * i;
                i++;
            }

        System.out.println("Факториал: " + result);

    }

    public static void allEvenNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для задачи 2: ");
        int n = scanner.nextInt();

        int i=1;

        while (i <= n){
            if(i % 2 ==0){
                System.out.println(i);
            }
            i++;
        }
    }

    public static void countdown(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для задачи 3: ");
        int n = scanner.nextInt();

        while (1 <= n){
            System.out.println(n);
            n--;
        }
    }

}
