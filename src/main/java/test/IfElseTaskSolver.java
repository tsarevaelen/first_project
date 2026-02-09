package test;

public class IfElseTaskSolver {
    public static void main(String[] args){
        IfElseTaskSolver ifElseTaskSolver = new IfElseTaskSolver();

        System.out.println(ifElseTaskSolver.checkParity(4));
        System.out.println(ifElseTaskSolver.checkParity(3));

        System.out.println(ifElseTaskSolver.checkAge(10));
        System.out.println(ifElseTaskSolver.checkAge(20));
        System.out.println(ifElseTaskSolver.checkAge(65));

        System.out.println(ifElseTaskSolver.checkMax(2,15,7));


    }
    public String checkParity(int number) {
        String parity = "Нечетное";
        if (number % 2 == 0) {
            parity = "Четное";
        }
        return parity;
    }

    public String checkAge(int number){
        String age = "";
        if (number < 18){
            age = "Несовершеннолетний";
        }
        if(number >= 18 && number <= 60){
            age = "Взрослый";
        }
        if(number > 60){
            age = "Пожилой";
        }
        return age;
    }

    public int checkMax(int a, int b, int c){
        int maxAB = b;
        if(a > b){
            maxAB = a;
        }
        int max = maxAB;
        if(c > maxAB){
            max = c;
        }
        return max;

    }
}
