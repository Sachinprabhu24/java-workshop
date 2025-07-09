public class Totalmark{
    public static void main(String[] args) {
        int[] marks = {97, 89, 95, 94, 85};
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        System.out.println("Total marks: " + total);
    }
}