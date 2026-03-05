import java.util.Scanner;
public class CurrencyConverter {
    public static double convert(double amount, double rate) {
        return amount * rate;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Currency Converter");

        System.out.println("Select Base Currency:");
        System.out.println("1. INR");
        System.out.println("2. USD");
        System.out.println("3. EUR");

        int base = sc.nextInt();

        System.out.println("Select Target Currency:");
        System.out.println("1. INR");
        System.out.println("2. USD");
        System.out.println("3. EUR");

        int target = sc.nextInt();

        System.out.print("Enter amount to convert: ");
        double amount = sc.nextDouble();

        double rate = 1;


        if (base == 1 && target == 2)
            rate = 0.012;      // INR → USD
        else if (base == 1 && target == 3)
            rate = 0.011;      // INR → EUR
        else if (base == 2 && target == 1)
            rate = 83.0;       // USD → INR
        else if (base == 2 && target == 3)
            rate = 0.92;       // USD → EUR
        else if (base == 3 && target == 1)
            rate = 90.0;       // EUR → INR
        else if (base == 3 && target == 2)
            rate = 1.08;       // EUR → USD
        else
            rate = 1;          // same currency

        double result = convert(amount, rate);

        System.out.println("Converted Amount: " + result);

        sc.close();
    }
}

