import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        System.out.println("hi my first project ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal:");
        int principal = scanner.nextInt();


        System.out.print("Annual Interest Rate : ");
        float annual = scanner.nextFloat();
        float monthlyInterest = annual / PERCENT / MONTH_IN_YEAR;
        System.out.println("Monthly Interest Rate: " + monthlyInterest);


        System.out.print("Period(Years):");
        int period = scanner.nextInt() * MONTH_IN_YEAR;

        float base = monthlyInterest + 1;
        double pw = Math.pow(base, period);

        // System.out.println(pw);

        double mortgage = principal * (monthlyInterest * pw) / (pw - 1);

        
        String mortagageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage " + mortagageFormatted);

    
        
    }
}