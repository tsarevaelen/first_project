package test;

public class Company {
 public static void main(String[] args){
     Company mag = new Company(1, "Иванов");
//     mag.employeeID = 3;
     System.out.println("Код сотрудника: " + mag.employeeID + ", фамилия: " + mag.employeeName);
     mag.printCompanyName();


     Company spar = new Company(2, "Петров");
     System.out.println("Код сотрудника: " + spar.employeeID + ", фамилия: " + spar.employeeName);
     spar.printCompanyName();

     mag.setEmployeeName("Иванов Иван");
     System.out.println("Код сотрудника: " + mag.employeeID + ", фамилия: " + mag.employeeName);

     Company.setCompanyName("Магнит гипер");

     mag.printCompanyName();
     spar.printCompanyName();

 }
    static String companyName = "Магнит";
    final int employeeID;
    String employeeName;

    Company(int someEmployeeID, String someEmployeeName){
         this.employeeID = someEmployeeID;
         this.employeeName = someEmployeeName;
    }

    static void printCompanyName(){
        System.out.println("Общее название для всех сотрудников: " + companyName);
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    void setEmployeeName(String newEmployeeName){
        this.employeeName = newEmployeeName;
    }

    static void setCompanyName (String newCompanyName){
        Company.companyName = newCompanyName;
    }
}
