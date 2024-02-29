public class CtoFTableDiplay {
    public static void main(String[] args) {
        //declare variables and logic
        for (int celsius = -100; celsius <= 100; celsius++) {
            double fahrenheit = CtoF(celsius);
            //output calculation
            System.out.printf("%d C = %.1f F\n", celsius, fahrenheit);

        }
    }
    //logic to determine celsius to fahrenheit
    public static double CtoF(double celsius) {
        return celsius * 9 / 5 + 32;
        
    }
}
