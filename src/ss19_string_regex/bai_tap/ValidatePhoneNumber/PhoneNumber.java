package ss19_string_regex.bai_tap.ValidatePhoneNumber;

import java.util.regex.Pattern;

public class PhoneNumber {
    public static final String[] validPhoneNumber= new String[] { "(+84)-(905996846)","(+84)-(123456789)" };
    public static final String[] invalidPhoneNumber = new String[] { "(+84)-(22222222)","(a8)-(222222225)" };
    public PhoneNumber() {
    }
    public static boolean validatePNum(String regex){
        return Pattern.compile("^\\(\\+84\\)\\-\\([0-9]{9}\\)$").matcher(regex).matches();
    }

    public static void main(String[] args) {

        for (String pn : validPhoneNumber) {
            boolean isvalid = validatePNum(pn);
            System.out.println("Phone number is " + pn +" is valid: "+ isvalid);
        }
        for (String pn : invalidPhoneNumber) {
            boolean isvalid = validatePNum(pn);
            System.out.println("Phone number is " + pn +" is valid: "+ isvalid);
        }
    }
}
