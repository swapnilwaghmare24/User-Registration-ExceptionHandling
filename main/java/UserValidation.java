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

    public static void main(String[] args) {
    UserValidation userValidation=new UserValidation();
    userValidation.firstName();
    }
}
