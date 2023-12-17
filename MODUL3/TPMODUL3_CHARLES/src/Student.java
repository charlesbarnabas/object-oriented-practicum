import java.util.ArrayList;

public class Student extends User{
    protected ArrayList<String> enrolledCourses;

    public Student(String Name, int Id){
        super(Name, Id);
        enrolledCourses = new ArrayList<>();
    }

    public void enrollinCourse(String course){
        enrolledCourses.add(course);
    }

    @Override
    public String getUserDetails() {
        return "Student - " + super.getUserDetails() + "\nEnrolled Courses: " + enrolledCourses;
    }
}
