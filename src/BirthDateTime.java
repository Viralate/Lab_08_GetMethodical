import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        //decalare integers and initate scanner, and prompt user for information
        Scanner in = new Scanner (System.in);
        int year = SafeInput.getRangedInt(in, "Enter the year of your birth", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter the month of your birth", 1, 12);
        int day = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, 31);
        int hour = SafeInput.getRangedInt(in, "Enter the hour of your birth", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter the minute of your birth", 1, 59);
        //print output in correct format of users input
        System.out.printf("You were born on %d-%d-%d at %d:%d\n", year, month, day, hour, minute);
    }
    
}
