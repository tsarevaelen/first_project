package practice_2;

public class StudentGroup {
    public static void main(String[] args) {
        StudentGroup mgu = new StudentGroup("ГМУ", 20);
        System.out.println("Название группы: " + mgu.groupName);
        System.out.println("Количество студентов: " + mgu.studentCount);

        mgu.setGroupName("Государственное управление");
        System.out.println(mgu.groupName);

        mgu.setStudentCount(18);
        System.out.println(mgu.studentCount);

        mgu.printInfo();

        mgu.studentCount = 15;
        mgu.printInfo();

    }

    String groupName;
    int studentCount;

    StudentGroup(String someGroupName, int someStudentCount) {
        this.groupName = someGroupName;
        this.studentCount = someStudentCount;
    }

    public String getGroupName(){
        return this.groupName;
    }

    public  int getStudentCount(){
        return this.studentCount;
    }

    void setGroupName(String newGroupName){
        this.groupName = newGroupName;
    }
    void setStudentCount(int newStudentCount){
        this.studentCount = newStudentCount;
    }

    void printInfo(){
        System.out.println("Название группы: " + this.groupName + ", количество студентов: " + this.studentCount);
    }


}

