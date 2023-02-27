import java.net.UnknownServiceException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NumberFormatToLocal {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        NumberFormat n1 = NumberFormat.getCurrencyInstance(Locale.US);
        String us = n1.format(payment);

        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = n2.format(payment);

        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = n3.format(payment);

        NumberFormat n4 = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String india = n4.format(payment);

        System.out.println("US: "+ us);
        System.out.println("India: "+ india);
        System.out.println("China: " + china);
        System.out.println("France: "+ france);

    }
}
