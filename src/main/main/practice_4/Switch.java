package practice_4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
//        System.out.println(dayOfWeek());
//
//        System.out.println(ticketPrice());

        //System.out.println(newGrade());
//        System.out.println(answer());

        System.out.println(solution());
    }

//    public static String dayOfWeek(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите день недели: ");
//        int day = scanner.nextInt();
//        String dayOfWeek = "";
//        switch (day){
//            case 1:
//                dayOfWeek = "Понедельник";
//                break;
//            case 2:
//                dayOfWeek = "Вторник";
//                break;
//            case 3:
//                dayOfWeek = "Среда";
//                break;
//            case 4:
//                dayOfWeek = "Четверг";
//                break;
//            case 5:
//                dayOfWeek = "Пятница";
//                break;
//            case 6:
//                dayOfWeek = "Суббота";
//                break;
//            case 7:
//                dayOfWeek = "Воскресенье";
//                break;
//            default:
//                dayOfWeek = "Ошибка";
//        }
//        return dayOfWeek;
//    }
//
//    public static String ticketPrice(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите день недели: ");
//        int day = scanner.nextInt();
//        String ticketPrice = "";
//
//        switch(day) {
//            case 1:
//                ticketPrice = "300 рублей";
//                break;
//
//            case 2:
//                ticketPrice = "300 рублей";
//                break;
//
//            case 3:
//                ticketPrice = "300 рублей";
//                break;
//
//            case 4:
//                ticketPrice = "300 рублей";
//                break;
//
//            case 5:
//                ticketPrice = "300 рублей";
//                break;
//
//            case 6:
//                ticketPrice = "450 рублей";
//                break;
//
//            case 7:
//                ticketPrice = "450 рублей";
//                break;
//
//            default:
//                ticketPrice = "Ошибка ввода";
//
//        }
//
//        return ticketPrice;
//    }

//    public static String newGrade(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество баллов: ");
//        int points = scanner.nextInt();
//        String newGrade = "";
//
//        if(points >=90 && points <=100){
//            newGrade = "A";
//        }
//         else if(points >=80 && points <=89){
//            newGrade = "B";
//        }
//         else if(points >=70 & points <=79) {
//            newGrade = "C";
//        }
//        else if(points >=60 & points <=69) {
//            newGrade = "D";
//        }
//        else {
//            newGrade = "F";
//        }
//
//
//        return newGrade;
//
//    }

//    public static String answer(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите команду: ");
//        String command = scanner.nextLine();
//        String answer = "";
//
//        switch (command){
//            case "start":
//                answer = "Система start запущена";
//                break;
//            case "stop":
//                answer = "Система stop запущена";
//                break;
//            case "restart":
//                answer = "Система restart запущена";
//                break;
//            case "status":
//                answer = "Система status запущена";
//                break;
//
//            default:
//                answer = "Ошибка системы";
//
//
//        }
//
//        return answer;
//    }

    public static String solution(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String a = scanner.nextLine();

        System.out.print("Введите оператор: ");
        String operator = scanner.nextLine();

        System.out.print("Введите второе число: ");
        String b = scanner.nextLine();

        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);




        int c = 0;

        switch(operator){
            case "+":
                c = x + y;
                break;

            case "-":
                c = x - y;
                break;

            case "*":
                c = x * y;
                break;

            case "/":
                if (y==0) {
                    return "Ошибка: деление на 0 невозможно";
                }
                c = x / y;
                break;

            default:
                System.out.println("Неизвестная ошибка");



        }
       return "Результат операции: " + c;
    }

}
