package ss19_string_regex.bai_tap.ValidateCourse;

import java.util.regex.Pattern;

public class Course {
    private static final String ACCOUNT_REGEX = "^[ACP]\\d{4}[GHIKLM]$";

    public Course() {
    }
    public boolean validateCourse(String regex){
        return
        Pattern.matches(ACCOUNT_REGEX,regex);
    }

}
