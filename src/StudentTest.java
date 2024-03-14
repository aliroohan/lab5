import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Ali", "FA23-BCS-010");
        s1.setCGPA(3.5);
        display(s1);
        System.out.println();

        Student s2 = new Student("Ahmad", "FA23-BCS-001");
        s2.setCGPA(3.4);
        display(s2);
        System.out.println();

        Student s3 = new Student("Talha", "FA23-BCS-002");
        s3.setCGPA(3.6);
        display(s3);
        System.out.println();

        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(new Student("Waleed", "FA23-BSE-020"));
        arrayList.add(new Student("Maha", "FA23-BSE-002"));
        displayStudents(arrayList);
        System.out.println();
        arrayList.remove(1);
        arrayList.remove(arrayList.getFirst());

        System.out.println("Size of ArrayList : " + arrayList.size());
        System.out.println();
        arrayList.set(0, new Student("Hamza", "FA23-BCS-003"));

        display(arrayList.get(0));


    }
    public static void displayStudents(ArrayList<Student> student){
        for (Student s : student) {
            display(s);
            System.out.println();
        }
    }
    static void display(Student s){
        System.out.println("Name : " + s.getName());
        System.out.println("ID : " + s.getId());
        System.out.println("CGPA : " + s.getCGPA());

    }
}
