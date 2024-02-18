import java.util.*;

class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getName() {
        return courseName;
    }
}

class Student {
    private String name;
    private String usn;
    private String department;
    private List<Course> registeredCourses;

    public Student(String name, String usn, String department) {
        this.name = name;
        this.usn = usn;
        this.department = department;
        registeredCourses = new ArrayList<>();
    }

    public void registerForCourse(Course course) {
        registeredCourses.add(course);
    }

    public String getName() {
        return name;
    }

    public String getUsn() {
        return usn;
    }

    public String getDepartment() {
        return department;
    }

    public List<Course> getRegisteredCourses() {
        return new ArrayList<>(registeredCourses);
    }
}

public class student {
    public static void main(String[] args) {
        // Create a sample student
        Student student = new Student("Alice", "4JN19CS001", "Computer Science");

        // Register for courses
        Course javaCourse = new Course("Java Programming");
        Course dbmsCourse = new Course("Database Management");
        student.registerForCourse(javaCourse);
        student.registerForCourse(dbmsCourse);

        // Display student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("USN: " + student.getUsn());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("Registered Courses:");
        for (Course course : student.getRegisteredCourses()) {
            System.out.println("- " + course.getName());
        }
    }
}
