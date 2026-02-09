package practice_3;

public class Company {
    public static void main(String[] args){
            Company smm = new Company(001, "Михаил");
            smm.printCompanyName();

            Company manager = new Company(002, "Иван");
            manager.printCompanyName();

            smm.setCompanyName("leto");
            smm.printCompanyName();
            manager.printCompanyName();

//            smm.setEmployeeID(005);
//            smm.printCompanyName(); - ошибка: cannot assign a value to final variable employeeID





        }

    static String companyName = "apple"; //— общее название для всех сотрудников
    final int employeeID;// — уникальный идентификатор (нельзя менять)
    String employeeName;// - имя сотрудника

    Company(int newEmplyeeID, String newEmployeeName){
        this.employeeID = newEmplyeeID;
        this.employeeName = newEmployeeName;
    }

    void printCompanyName(){
        System.out.println("Название компании: " + this.companyName + ", идентификатор сотрудника: "+ this.employeeID + ", имя сотрудника: " + this.employeeName);
    }

    public String getEmployeeName(){
        return this.employeeName;
    }
    void setCompanyName(String newCompanyName){
        this.companyName = newCompanyName;
    }

//    void setEmployeeID(int newEmployeeID){
//        this.employeeID = newEmployeeID;
//    } - пробую изменить


}




