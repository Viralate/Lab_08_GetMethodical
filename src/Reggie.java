import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        //initate scanner and declare variables and get user input
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        String studentMNumber = SafeInput.getRegExString(in, "Enter your UC Student M number", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice (O: Open, S: Save, V: View, Q: Quit)", "^[OoSsVvQq]$");
        //print user input
        System.out.println("Your SSN: " + ssn);
        System.out.println("Your Student M Number: " + studentMNumber);
        System.out.println("Your Menu Choice: " + menuChoice);
    }
}
