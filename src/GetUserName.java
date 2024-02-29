import java.util.Scanner;

public class GetUserName {
    public static void main (String[] args) {
        //declare scanner and variables
        Scanner in = new Scanner(System.in);
        String firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        String lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        //print user input
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
}
