public class StudentDetails {
    public static void main(String[] args) {
        String[][] students = {
            {"2422K1311", "Sachin"},
            {"2422K1312", "Prabhu"},
            {"2422K1313", "James"},
            {"2422K1314", "Ravi"},
            {"2422K1315", "Suresh"}
        };    

        System.out.println("Student Details:");
        for (String[] student : students) {
            String rollNo = student[0];
            String name = student[1];
            System.out.printf("Roll No: "+rollNo+",Name: "+name+"%n");
        }
    }
}