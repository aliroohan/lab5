import java.util.Scanner;

public class CourseTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Courses");
        int n = sc.nextInt();
        Course[] courses = new Course[n];
        for (int i = 0; i < courses.length; i++) {
            System.out.println("Enter Course " + (i + 1) + " Details");
            System.out.println("Enter Course Title");
            sc.nextLine();
            String courseTitle = sc.nextLine();
            System.out.println("Enter Course Code");
            String courseCode = sc.nextLine();
            System.out.println("Enter Course Credit Hours");
            int courseCreditHr = sc.nextInt();
            courses[i] = new Course(courseTitle, courseCode, courseCreditHr);
        }

        for (int i = 0; i < courses.length; i++) {
            System.out.println("Course " + (i + 1) + " Details");
            System.out.println("Course Title: " + courses[i].getCourseTitle());
            System.out.println("Course Code: " + courses[i].getCourseCode());
            System.out.println("Course Credit Hours: " + courses[i].getCourseCreditHr());
        }
    }
}
