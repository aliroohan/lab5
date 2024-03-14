import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("Ali");
        student.add("Ahmed");
        student.add("Umer");
        student.add("Talha");

        displayStudents(student);
        System.out.println();

        student.add("Tooba");
        student.add("Waleed");
        displayStudents(student);

        System.out.println();
        System.out.println("Size : " + student.size());
        System.out.println();

        student.add(0, "Hamza");
        student.add(1, "Rizwan");

        student.sort(null);

        displayStudents(student);
        System.out.println();
        student.remove("Tooba");
        displayStudents(student);
        student.remove(student.size()-1);
        System.out.println();
        displayStudents(student);
    }
    public static void displayStudents(ArrayList<String> student){
        for (String s : student) {
            System.out.println(s);
        }
    }
}
