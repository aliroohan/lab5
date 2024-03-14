import java.util.Scanner;

public class Course2 {
    String courseTitle;
    int [][] marks;

    public Course2(String courseTitle,int numberOfStudents) {
        this.courseTitle = courseTitle;
        marks = new int[numberOfStudents][];
    }

    void inputMarksData(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter number of subjects for student " + (i+1));
            int numberOfSubjects = sc.nextInt();
            marks[i] = new int[numberOfSubjects];
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("Enter marks for subject " + (j+1));
                marks[i][j] = sc.nextInt();
            }
        }
    }

    void displayMarksData(){
        System.out.println("Marks of Each Student");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i+1) + " : ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
