import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Currency Converter =====");

        System.out.print("From Currency: ");
        String fromCurrency = sc.next();

        System.out.print("To Currency: ");
        String toCurrency = sc.next();

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        // Example Exchange Rate
        double exchangeRate = 87.63;

        double convertedAmount = amount * exchangeRate;

        System.out.println("\nConverted Amount:");

        // Financial formatting (2 decimal places)
        System.out.printf("%.2f %s%n", convertedAmount, toCurrency);

        sc.close();
    }
}