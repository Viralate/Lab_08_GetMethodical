import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        //initate scanner and declare variables
        Scanner in = new Scanner(System.in);
        double totalCost = 0;
        boolean moreItems;
        //initate loop 
        do {
            //initate get ranged double and capture user input if they have more items
            double price = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
            totalCost += price;
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items?");
            // declare while loop
        } while (moreItems);
        //print total cost of items 
        System.out.printf("Total cost of the items: $%.2f\n", totalCost);
    }
    
}
