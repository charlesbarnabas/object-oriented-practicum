import java.util.Scanner;

public class Main {
    static String[][] courses = {
            {"101", "Statistika Industri", "Haris", "Metta"},
            {"102", "Desain Jaringan Komputer", "Windy", "Amilia"}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Student: ");
        String studentName = scanner.nextLine();

        int studentID;

        while (true) {
            try {
                System.out.print("Masukkan ID Student: ");
                studentID = Integer.parseInt(scanner.nextLine());
                if (studentID > 0) {
                    break;
                } else {
                    System.out.println("Invalid input. ID Student harus lebih dari 0");
                }
            } 
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Tolong inputkan Student ID dalam integer");
            }
        }

        Student student = new Student(studentName, studentID);

        System.out.print("Masukkan course yang mau diambil (dipisahkan oleh koma(,)): ");
        String[] enrolledCourses = scanner.nextLine().split(", ");

        for (String course : enrolledCourses) {
            student.enrollinCourse(course);
        }

        for (String[] courseInfo : courses) {
            System.out.println("\nCourse ID: " + courseInfo[0]);
            System.out.println("Course Name: " + courseInfo[1]);
            System.out.println("- Student: " + courseInfo[2]);
            System.out.println("- Student: " + courseInfo[3]);
            System.out.print("\n");
        }

        System.out.println(student.getUserDetails());

        Teacher teacher = new Teacher("Yoga Raditya", 1);
        teacher.teachClass("Math");

        Admin admin = new Admin("Hudza", 1);
        admin.manageSystem("University System");

        scanner.close();
    }
}
