package test;

public class ForTaskSolver {
    public static void main(String[] args) {
        multiplayTable(5);

        System.out.println(sumOfAllNumbers(10));

        System.out.println(chekNumbersSimple(7));
        System.out.println(chekNumbersSimple(6));


    }

    public static void multiplayTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    number + " + " + i + " = " + number * i);
        }
    }

    public static int sumOfAllNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }



    public static boolean chekNumbersSimple(int number){
        boolean isSimple = true;
        for(int i = 2; i <= number - 1; i++){
            if(number % i == 0){
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }
}
