package practice_4;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
//        System.out.println(sumAllNumbers());
//        multiplicationTable();
        checkPrime();
        Number();

    }
//    public static int sumAllNumbers(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число n: ");
//        int n = scanner.nextInt();
//        int sum = 0;
//        for(int i = 1; i <= n; i++){
//            sum = sum + i;
//        }
//        return sum;
//    }

//    public static void multiplicationTable(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите число, которое нужно умножить: ");
//        int n = scanner.nextInt();
//        for(int i = 1; i <= 10; i++){
//           System.out.println(n + "*" + i + "=" + (n * i));
//        }
//    }

    public static void checkPrime(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        int n = scanner.nextInt();
        boolean isPrime = true;

        for(int i = 2; i< n; i++){
            if (n % i == 0){
                isPrime = false;
            }
        }

        if (isPrime == false){
            System.out.println("Число непростое");
        } else {
            System.out.println("Число простое");
        }
    }

    public static void Number(){
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

    }
}

