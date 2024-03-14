import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter course title");
        String courseTitle = scan.nextLine();
        System.out.println("Enter number of students");
        int numberOfStudents = scan.nextInt();
        Course2 course = new Course2(courseTitle, numberOfStudents);
        course.inputMarksData();
        course.displayMarksData();
    }
}
