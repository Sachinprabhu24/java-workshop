public class Employee {
    public static void main(String[] args) {
        String[][] employees= new String[5][3];
        employees[0][0]="E0001";
        employees[0][1]="Sachin";
        employees[0][2]="35000";
        employees[1][0]="E0002";
        employees[1][1]="Shobha";
        employees[1][2]="39000";
        employees[2][0]="E0003";
        employees[2][1]="Rahul";
        employees[2][2]="45000";
        employees[3][0]="E0004";
        employees[3][1]="Rahul";
        employees[3][2]="50000";
        employees[4][0]="E0005";
        employees[4][1]="Suresh";
        employees[4][2]="59000";
        for (String[] employee : employees) {
            System.out.println(Arrays.toString(employee));
        }
    }
}