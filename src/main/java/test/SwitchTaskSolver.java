package test;

public class SwitchTaskSolver {
    public static void main(String[] args){
        SwitchTaskSolver switchTaskSolver = new SwitchTaskSolver();
        System.out.println(SwitchTaskSolver.dayOfWeek(1));
        System.out.println(SwitchTaskSolver.dayOfWeek(16));

        System.out.println(SwitchTaskSolver.desctibeSeason(Season.WINTER));

    }
    public static String dayOfWeek(int day) {
        String dayOfWeek = "";
        switch (day) {
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek = "Несуществующий день";

        }
        return dayOfWeek;
    }

    public static String desctibeSeason(Season season){
        String description = "";
        switch (season){
            case WINTER -> description = "Зима- холодно";
            case SUMMER -> description = "Лето-жарко";
            case SPRING -> description = "Весна-цветы";
            case AUTUMN -> description = "Осень - падают листья";
        }
        return description;
    }
}
