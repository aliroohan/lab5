public class Course {
    private String courseTitle;
    private String courseCode;
    private int courseCreditHr;

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCourseCreditHr() {
        return courseCreditHr;
    }

    public void setCourseCreditHr(int courseCreditHr) {
        this.courseCreditHr = courseCreditHr;
    }

    public Course(String courseTitle, String courseCode, int courseCreditHr) {
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
        this.courseCreditHr = courseCreditHr;
    }
}
