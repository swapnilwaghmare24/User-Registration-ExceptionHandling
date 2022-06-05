import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public void firstName() {

        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstName = scanner.next();
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        if (result == true)
            System.out.println("First Name is valid");
        else
            System.out.println("First Name is Invalid");
    }
    public void lastName() {

        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Last Name:");
        String lastName = scanner.next();
        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();

        if (result == true)
            System.out.println("Last Name is Valid");
        else
            System.out.println("Last Name is Invalid");
    }
    public void email() {
        String emailPattern = "[a-z]+[.]?[a-z]*@[a-z]+.[a-z]+[.a-z]*";
        System.out.println("Enter your Email:");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();

        if (result == true)
            System.out.println("Email is Valid");
        else
            System.out.println("Email is not valid");
    }
    public void mobileNumber() {
        Scanner scanner = new Scanner(System.in);
        String MobileNumberPattern = "(91-){1}[0-9]{10}";
        System.out.println("Enter the phone number");
        String phoneNumber = scanner.next();
        Pattern pattern = Pattern.compile(MobileNumberPattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        Boolean result = matcher.matches();

        if (result == true)
            System.out.println("Mobile number is valid");
        else
            System.out.println("Mobile number is invalid");
    }

    public static void main(String[] args) {
    UserValidation userValidation=new UserValidation();
    //userValidation.firstName();
    //userValidation.lastName();
    //userValidation.email();
        userValidation.mobileNumber();
    }
}
