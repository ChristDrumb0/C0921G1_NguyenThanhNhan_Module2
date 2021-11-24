package ss19_string_regex.bai_tap.ValidateCourse;

public class CourseMain {

    private static Course courses;
    public static final String[] validCourse = new String[] { "C0318G","A1234H","P5432I" };
    public static final String[] invalidCourse = new String[] { "M0318G","P0323A" };

    public static void main(String[] args) {
        courses = new Course();
        for (String course : validCourse) {
            boolean isvalid = courses.validateCourse(course);
            System.out.println("Course is " + course +" is valid: "+ isvalid);
        }
        for (String course : invalidCourse) {
            boolean isvalid = courses.validateCourse(course);
            System.out.println("Course is " + course +" is valid: "+ isvalid);
        }
    }
}
