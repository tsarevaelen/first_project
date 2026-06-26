package practice_3;

public class University {
    public static void main(String[] args){
        University kolya = new University(1, "Коля");
        kolya.printStudentInfo();

        University misha = new University(2, "Миша");
        misha.printStudentInfo();

        University olya = new University(3, "Оля");
        olya.printStudentInfo();


        University.changeUniversityName("МГЮА");
        kolya.printStudentInfo();
        misha.printStudentInfo();
        olya.printStudentInfo();



    }
    static String universityName = "МГУ";
    final int studentID;
    String studentName;

    University(final int someStudentID, String someStudentName){
        this.studentID = someStudentID;
        this.studentName = someStudentName;
    }

    void printStudentInfo(){
        System.out.println("Имя: " + this.studentName + ", ID: " + this.studentID + ",университет: " + this.universityName);
    }

    public String getStudentName(){
        return this.studentName;
    }

    static void changeUniversityName(String newUniversityName){
        universityName = newUniversityName;
    }

}
