import java.util.Currency;
import java.util.Locale;
import java.text.NumberFormat;

public class currency {
      public static void main(String[] args) {
        // Get the currency instance for a specific country
        Currency usd = Currency.getInstance("USD"); // US Dollar
        // Currency inr = Currency.getInstance(new Locale("en", "IN")); // Indian Rupee
        Locale indiaLocale = new Locale("en", "IN");

            // Get the Currency instance for India
        Currency inr = Currency.getInstance(indiaLocale);


        // Display currency details
        /* System.out.println("Currency Code (USD): " + usd.getCurrencyCode());
        System.out.println("Currency Symbol (USD): " + usd.getSymbol());
        System.out.println("Fraction Digits (USD): " + usd.getDefaultFractionDigits());

        System.out.println("\nCurrency Code (INR): " + inr.getCurrencyCode());
        System.out.println("Currency Symbol (INR): " + inr.getSymbol());
        System.out.println("Fraction Digits (INR): " + inr.getDefaultFractionDigits()); */

        // Combine with NumberFormat for localized currency formatting
        double amount = 12324.134;
        System.out.println("\nFormatted Amount (USD): " 
            + java.text.NumberFormat.getCurrencyInstance(Locale.US).format(amount));
        System.out.println("Formatted Amount (INR): " 
            + java.text.NumberFormat.getCurrencyInstance(new Locale( "en", "IN")).format(amount));
          
        /* NumberFormat formatter = NumberFormat.getCurrencyInstance(indiaLocale);
        System.out.println("Formatted Amount: " + formatter.format(amount)); */
    }
}
