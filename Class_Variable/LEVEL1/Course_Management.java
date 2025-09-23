class Course {
    String courseName;
    int duration;   
    double fee;

    static String instituteName;

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}
public class Course_Management {
    public static void main(String[] args) {
        Course.updateInstituteName("GLA University");

        Course c1 = new Course("Cloud Computing", 90, 6000.0);
        Course c2 = new Course("Gen AI", 60, 4500.0);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("IIT Delhi");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
