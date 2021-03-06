import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public boolean firstName(String firstName) {

        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        return result;
    }

    public boolean lastName(String lastName) {

        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        return result;
    }

    public boolean email(String email) {
        String emailPattern = "[a-z]+[.]?[a-z]*@[a-z]+.[a-z]+[.a-z]*";
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        return result;
    }

    public boolean mobileNumber(String phoneNumber) {
        String MobileNumberPattern = "(91-){1}[0-9]{10}";
        Pattern pattern = Pattern.compile(MobileNumberPattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        Boolean result = matcher.matches();
        return result;
    }

    public boolean password(String passWord) {
        String PasswordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&])[a-zA-Z0-9@#$%^&]{8,}$";
        Pattern pattern = Pattern.compile(PasswordPattern);
        Matcher matcher = pattern.matcher(passWord);
        Boolean result = matcher.matches();
        return result;
    }

    public static void main(String[] args) {
        UserValidationCustomException userValidationCustomException=new UserValidationCustomException();
        try {
            userValidationCustomException.firstName();
        } catch (CustomException e) {
            System.out.println(e);
        }
        try {
            userValidationCustomException.lastName();
        } catch (CustomException e) {
            System.out.println(e);
        }
        try {
            userValidationCustomException.email();
        } catch (CustomException e) {
            System.out.println(e);
        }
        try {
            userValidationCustomException.mobileNumber();
        } catch (CustomException e) {
            System.out.println(e);
        }
        try {
            userValidationCustomException.password();
        } catch (CustomException e) {
            System.out.println(e);
        }

    }
}



