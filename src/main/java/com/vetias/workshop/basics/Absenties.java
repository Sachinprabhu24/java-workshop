public class Absenties {
    public static void main(String[] args) {
        String[][] students = {
            {"2422K1311", "Sachin"},
            {"2422K1312", "Prabhu"},
            {"2422K1313", "James"},
            {"2422K1314", "Ravi"},
            {"2422K1315", "Suresh"}
        };

        System.out.println("Initial Students List:");
        for (String[] student : students) {
            System.out.println("RollNo: " + student[0] + ", Name: " + student[1]);
        }

        int indexToDelete = 4; 

        if (indexToDelete < 0 || indexToDelete >= students.length) {
            System.out.println("\nError: Invalid index to delete.");
            return; // Exit if index is out of bounds
        }
        System.out.println("\nMarking student at index " + indexToDelete + " (" + students[indexToDelete][1] + ") as absent and removing...");
        String[][] presentStudents = new String[students.length - 1][2];
        int newArrayIndex = 0;
        for (int i = 0; i < students.length; i++) {
            if (i == indexToDelete) {
                continue;
            }
            presentStudents[newArrayIndex][0] = students[i][0];
            presentStudents[newArrayIndex][1] = students[i][1];
            newArrayIndex++; 
        }

        System.out.println("\n--- Present Students (After Deletion) ---");
        if (presentStudents.length == 0) {
            System.out.println("No students left after deletion.");
        } else {
            for (String[] student : presentStudents) {
                System.out.println("RollNo: " + student[0] + ", Name: " + student[1]);
            }
        }
    }
}