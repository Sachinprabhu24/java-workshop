public class Employee {
    public static void main(String[] args) {
        String[][] employee= new String[5][3];
        employee[0][0]="E0001";
        employee[0][1]="Sachin";
        employee[0][2]="35000";
        employee[1][0]="E0002";
        employee[1][1]="Shobha";
        employee[1][2]="39000";
        employee[2][0]="E0003";
        employee[2][1]="Rahul";
        employee[2][2]="45000";
        employee[3][0]="E0004";
        employee[3][1]="Rahul";
        employee[3][2]="50000";
        employee[4][0]="E0005";
        employee[4][1]="Suresh";
        employee[4][2]="59000";
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee ID: "+employee[i][0]+", Name: "+employee[i][1]+", Salary: "+employee[i][2]);
        }
    }
}